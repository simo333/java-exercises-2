package pl.strings;


public class Main02 {
    public static String replaceStr(String str, String forReplace, String replacement) {
        return str.replace(forReplace, replacement);
    }

    public static void main(String[] args) {
        System.out.println(replaceStr("Java to język programowania. Java jest obiektowa. Kurs Java", "Java", "jawa"));

    }

}
