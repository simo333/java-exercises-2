package pl.files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Main04 {
    public static void rewrite() {
        Scanner scan = new Scanner(System.in);
        List<String> strings;
        System.out.print("Podaj ścieżkę do pliku: ");
        String filename = scan.nextLine();
        Path path = Paths.get(filename);

        try {
            strings = Files.readAllLines(path);
            Files.write(Paths.get(path + "_2"), strings, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            Files.write(Paths.get(path + "_2"), strings, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Nie można odnaleźć pliku. " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        rewrite();

    }

}
