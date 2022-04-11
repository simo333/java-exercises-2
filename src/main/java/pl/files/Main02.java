package pl.files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main02 {
    public static int count(String fileName) {
        String wordDelimiters = "[-()\\[\\]\\{}!?:;<>|\\., ]";
        Path path = Paths.get(fileName);
        int wordsCounter = 0;
        List<String> strings = new ArrayList<>();
        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Nie udało się odczytać pliku. " + e.getMessage());
        }

        for (String string : strings) {
            String[] words = string.split(wordDelimiters);
            System.out.println(Arrays.toString(words));
            wordsCounter += words.length;
        }
        return wordsCounter;
    }

    public static void main(String[] args) {
        System.out.println(count("plik.txt"));

    }

}
