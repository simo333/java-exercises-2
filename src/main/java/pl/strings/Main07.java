package pl.strings;


public class Main07 {
    static String[] censoredWords = {"kurwa", "jebać", "pojeb", "wyjebane", "chuj"};
    public static String censor(String str, String[] words) {
        String[] strings = str.split(" ");
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < censoredWords.length; j++) {
                if(strings[i].equals(censoredWords[j])) {
                    strings[i] = "****";
                }
            }
        }

        for (String string : strings) {
            resultString.append(string).append(" ");
        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        System.out.println((censor("Zaraz tu kurwa nie wytrzymam co za chuj", censoredWords)));

    }

}
