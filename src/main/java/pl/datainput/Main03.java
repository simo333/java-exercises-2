package pl.datainput;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main03 {
    static String[] people = new String[0];
    static String[] retirees = new String[0];

    public static String[] retirement() {
        getPeople();
        for (String person : people) {
            int yearOfBirth = Integer.parseInt(person.split(" ")[2]);
            if (person.split(" ")[3].equalsIgnoreCase("m") && LocalDate.now().getYear() - yearOfBirth >= 65) {
                retirees = Arrays.copyOf(retirees, retirees.length + 1);
                retirees[retirees.length - 1] = person.split(" ")[1] + " " + person.split(" ")[0];
            } else if (person.split(" ")[3].equalsIgnoreCase("f") && LocalDate.now().getYear() - yearOfBirth >= 60) {
                retirees = Arrays.copyOf(retirees, retirees.length + 1);
                retirees[retirees.length - 1] = person.split(" ")[1] + " " + person.split(" ")[0];
            }
        }
        return retirees;
    }

    public static void getPeople() {
        Scanner scan = new Scanner(System.in);
        boolean endAdding = false;
        System.out.println("Enter people by adding every person in a single line in format: lastName name yearOfBirth sex. Type 'quit' to finish adding.");
        while (!endAdding) {
            String person = scan.nextLine();
            if (person.equalsIgnoreCase("quit")) {
                endAdding = true;
                continue;
            }
            String[] personArray = person.split(" ");
            try {
                if (validateName(personArray[0]) && validateName(personArray[0]) && validateAge(personArray[2]) && validateSex(personArray[3])) {
                    people = Arrays.copyOf(people, people.length + 1);
                    people[people.length - 1] = person;
                } else {
                    throw new IllegalArgumentException("Wrong format. Valid format: lastName name yearOfBirth sex");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean validateName(String name) {
        char[] chars = name.toCharArray();
        for (char aChar : chars) {
            if (!Character.isLetter(aChar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateAge(String yearOfBirth) {
        try {
            int year = Integer.parseInt(yearOfBirth);
            if (year > 1900 && year < LocalDate.now().getYear()) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static boolean validateSex(String sex) {
        char sexFirstChar = sex.toLowerCase().charAt(0);
        return sexFirstChar == 'm' || sexFirstChar == 'f';
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(retirement()));
    }
}
