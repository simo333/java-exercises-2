package pl.strings;


public class Main05 {
    public static String encode(String str) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character encodedChar = encoder(str.charAt(i), 20);
            resultString.append(encodedChar);
        }
        return resultString.toString();
    }

    public static Character encoder(Character character, int shift) {
        String alphabet = "AĄBCĆDEĘFGHIJKLŁMNŃOÓÓPQRSŚTUVWXYZŹŻaąbcćdeęfghijklłmnńoópqrsśtuvwxyzźż";

        if (character == ' ') {
            return character;
        }
        int charIndex = alphabet.indexOf(character);
        return alphabet.charAt((charIndex + shift) % alphabet.length());
    }

    public static void main(String[] args) {
        System.out.println(encode("ala 1"));
    }

}
