package pl.datainput;

import java.util.Scanner;

public class Main01 {
    public static void printTriangle() {
        int size = getIntInput();
        int[][] triangle = new int[size][];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj wielkość trójkąta:");
            String input = scanner.nextLine();
            int size;
            try {
                size = Integer.parseInt(input);
                if (size < 1) {
                    throw new IllegalArgumentException("Podano wartość mniejszą od zera. ");
                }
                return size;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        printTriangle();
    }
}