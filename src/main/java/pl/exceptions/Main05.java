package pl.exceptions;


import java.util.NoSuchElementException;

public class Main05 {
    public static int indexOf(int[] elements, int value) {
        int indexOfValue = -1;

        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == value) {
                indexOfValue = i;
            }
        }
        if(indexOfValue == -1) {
            throw new NoSuchElementException("Nie znaleziono podanego elementu. ");
        }

        return indexOfValue;
    }
    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2));
            System.out.println(indexOf(new int[]{}, 2));
        } catch (NoSuchElementException e) {
            System.out.println("Błąd. " + e.getMessage());
        }

    }

}
