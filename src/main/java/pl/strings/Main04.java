package pl.strings;


import java.util.ArrayList;
import java.util.List;

public class Main04 {
    public static int tripple(String str) {
        List<Character> checkedChars = new ArrayList<>();
        int foundTripleChars = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int counter = 0;
            if (checkedChars.contains(str.charAt(i))) {
                continue;
            }
            for (char aChar : chars) {
                if (aChar == chars[i]) {
                    counter++;
                }
            }
            checkedChars.add(chars[i]);
            foundTripleChars = foundTripleChars + counter / 3;
        }
        return foundTripleChars;
    }

    public static void main(String[] args) {
        System.out.println(tripple("qazbbbwsx "));
        System.out.println(tripple("aaawsxbbb "));
    }

}
