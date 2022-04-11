package pl.files;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main03 {
    public static boolean checkFileExists() {
        String filename = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ścieżkę do pliku: ");
        scan.nextLine();

        Path path = Paths.get(filename);
        return Files.exists(path);
    }

    public static void main(String[] args) {
        System.out.println(checkFileExists());

    }

}
