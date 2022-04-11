package pl.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static int count(String fileName) {
        Path path = Paths.get(fileName);
        List<String> strings = new ArrayList<>();
        StringBuilder resultString = new StringBuilder();
        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Nie można otworzyć pliku. " + e.getMessage());
        }
        for (String string : strings) {
            resultString.append(string);
        }
        return resultString.toString().length();
    }

    public static void main(String[] args) {
        System.out.println(count("plik.txt"));

    }

}
