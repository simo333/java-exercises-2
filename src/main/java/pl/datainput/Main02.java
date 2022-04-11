package pl.datainput;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main02 {
    public static int[] sortedArray() {
        int[] arr = new int[getIntInput()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(101);
        }
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int getIntInput() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj wielkość tablicy:");
            String input = scan.nextLine();
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
        System.out.println(Arrays.toString(sortedArray()));
    }
}
