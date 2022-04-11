package pl.strings;

public class Main03 {
    public static String upperCase(String str, int index) {
        if (index <= 0) {
            throw new ArithmeticException("Invalid argument. Index cannot be less or equal than 0. Found: " + index);
        }
        char[] chars = str.toCharArray();
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i % index == 0) {
                resultString.append(Character.toUpperCase(str.charAt(i)));
            } else {
                resultString.append(str.charAt(i));
            }
        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        System.out.println(upperCase("ala ma kota", 3));
    }

}
