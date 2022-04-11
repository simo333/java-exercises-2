package pl.exceptions;


public class Main02 {
    public static String safeGet(String[] strTab, int index) {
        String result = "";
        try {
            result = strTab[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks poza tablicą. " + e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(safeGet(new String[]{"ok"}, 2));

    }

}
