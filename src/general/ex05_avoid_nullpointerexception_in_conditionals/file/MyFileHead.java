package general.ex05_avoid_nullpointerexception_in_conditionals.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Collections;

public class MyFileHead {
    public static void main(String[] args) throws IOException {
        writeMessage("hello", Paths.get("./hello.txt"));
    }

    static void writeMessage(String message, Path location) throws IOException {
        if(message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("메시지가 유효하지 않습니다!");
        }

        if(location == null || Files.isDirectory(location)) {
            throw new IllegalArgumentException("경로가 유효하지 않습니다!");
        }

        String entry = LocalDate.now() + ": " + message;
        Files.write(location, Collections.singletonList(entry), StandardCharsets.UTF_8,
            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
