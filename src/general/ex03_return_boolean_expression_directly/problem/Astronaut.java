/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
 ***/

package general.ex03_return_boolean_expression_directly.problem;

class Astronaut {

    String name;
    int missions;

    boolean isValid() {
        boolean isValidMissions = missions >= 0;
        boolean isValidName = name != null && !name.trim().isEmpty();
        return isValidMissions && isValidName;
    }
}
