package com.github.matjanko.adventofcode.dayfour;


/**
 * @author matjanko
 *
 */

public class SecureContainerService {

    public long getDifferentPasswordCount(int start, int end) {
        int count = 0;
        int password = start;
        int[] digitsArray;
        boolean isCorrect;
        for (int i = 0; i < end - start; i++) {
            isCorrect = false;

            if (password > end) {
                break;
            }

            digitsArray = convertDigitsToArray(password);

            for (int j = 0; j < digitsArray.length; j++) {
                if (j == digitsArray.length - 1) {
                    break;
                } else if (digitsArray[j+1] < digitsArray[j]) {
                    isCorrect = false;
                    break;
                } else if (digitsArray[j+1] == digitsArray[j]) {
                    isCorrect = true;
                }
            }

            if (isCorrect) {
                ++count;
            }

            ++password;
        }

        return count;
    }

    private int[] convertDigitsToArray(int digits) {
        String s = Integer.toString(digits);
        int[] array = new int[s.length()];

        for (int j = 0; j < s.length(); j++) {
            array[j] = Character.getNumericValue(s.charAt(j));
        }

        return array;
    }
}
