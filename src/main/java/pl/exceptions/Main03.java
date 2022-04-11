package pl.exceptions;


public class Main03 {
    public static int getLength(String str) {
        int result = 0;
        try {
            result = str.length();
        } catch (NullPointerException e) {
            System.out.println("Brak stringa. " + e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getLength(null));

    }

}
