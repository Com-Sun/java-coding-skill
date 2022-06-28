package general.ex05_avoid_nullpointerexception_in_conditionals.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHead {

    public static void main(String[] args) {
        try {
            int lineNum = Integer.parseInt(args[0]);
            String filename = args[1];

            File file = new File(filename);
            if (file.exists() && !file.isDirectory()) {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String line = "";
                int i = 1;

                while ((line = br.readLine()) != null && i < lineNum) {
                    System.out.println(i + ":" + line);
                    i++;
                }
            } else {
                throw new FileNotFoundException("파일이 아닙니다.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}