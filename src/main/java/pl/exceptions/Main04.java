package pl.exceptions;


public class Main04 {
    public static int toInt(String str) {
        int result = 0;

        try {
            result = Integer.parseInt(str);
        } catch (NullPointerException e) {
            System.out.println("Parametr ma wartość null. " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Nie udało się zamienić na liczbę całkowitą. " + e.getMessage());
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(toInt("ad"));

    }

}
