package pl.strings;


public class Main06 {
    public static String encode(String str, int shift) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character encodedChar = cipher(str.charAt(i), shift, CipherMode.ENCODE);
            resultString.append(encodedChar);
        }
        return resultString.toString();
    }

    public static String decode(String str, int shift) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character encodedChar = cipher(str.charAt(i), shift, CipherMode.DECODE);
            resultString.append(encodedChar);
        }
        return resultString.toString();
    }


    public static Character cipher(Character character, int shift, CipherMode mode) {
        String alphabet = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPQRSŚTUVWXYZŹŻaąbcćdeęfghijklłmnńoópqrsśtuvwxyzźż";

        if (character == ' ') {
            return character;
        }
        int charIndex = alphabet.indexOf(character);
        if (mode == CipherMode.ENCODE) {
            return alphabet.charAt((charIndex + shift) % alphabet.length());
        } else if (mode == CipherMode.DECODE) {
            int shiftedIndex = (charIndex - shift) % alphabet.length();
            if (shiftedIndex < 0) {
                return alphabet.charAt(alphabet.length() + shiftedIndex);
            }
            return alphabet.charAt(shiftedIndex);
        } else {
            throw new IllegalArgumentException("Missing cipher mode");
        }
    }

    public static void main(String[] args) {
        String message = "Cześć tu Szymon";
        int shift = 500;
        String encoded = encode(message, shift);
        System.out.println("Encoded: " + encoded);
        String decoded = decode(encoded, shift);
        System.out.println("Decoded: " + decoded);
        System.out.println(message.equals(decoded));


    }

    enum CipherMode {ENCODE, DECODE}

}
