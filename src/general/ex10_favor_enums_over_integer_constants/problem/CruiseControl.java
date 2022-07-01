/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package general.ex10_favor_enums_over_integer_constants.problem;

class CruiseControl {
    static final int STOP_PRESET = 0;
    static final int PLANETARY_SPEED_PRESET = 1;
    static final int CRUISE_SPEED_PRESET = 2;

    static final double STOP_SPEED_KMH = 0;
    static final double PLANETARY_SPEED_KMH = 7667;
    static final double CRUISE_SPEED_KMH = 16944;

    private double targetSpeedKmh;

    void setPreset(int speedPreset) {
    }

    void setTargetSpeedKmh(double speedKmh) {
        targetSpeedKmh = speedKmh;
    }
}

//enum SpeedPreset{
//    STOP(0), HI(123)
//
//}

class Main {
    static final int PLANETARY_SPEED_PRESET = 1;

    static void usage() {
        CruiseControl cruiseControl = null;
        cruiseControl.setPreset(PLANETARY_SPEED_PRESET);
        cruiseControl.setPreset(2);
        cruiseControl.setPreset(-1); // targetSpeed not affected
    }
}
