package Lek06Arrays;

import java.util.Arrays;

public class opgave01d {
    static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
