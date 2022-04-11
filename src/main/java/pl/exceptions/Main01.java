package pl.exceptions;


public class Main01 {
    public static void average(String a, String b) {
        int intResult = 0;
        double doubleResult = 0;

        try {
            intResult = Integer.parseInt(a) + Integer.parseInt(b);
//            intResult /= Integer.parseInt(b);
            doubleResult = Double.parseDouble(a) + Double.parseDouble(b);
            System.out.println("intResult: " + intResult);
            doubleResult /= Double.parseDouble(b);
            System.out.println("doubleResult: " + doubleResult);
            if(Double.isInfinite(doubleResult)) {
                throw new ArithmeticException("Wykryto wartość double jako infinite.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez 0. " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Nie udało się zamienić na liczbę. " + e.getMessage());
        }

    }
    public static void main(String[] args) {
        average("1.3","0");

    }

}
