package Lek06Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class opgave05 {
    static void main(String[] args) {
        // print velkomst
        // læs indtastet tal
        // tæl antal forekomster af hvert tal
        // gentag indtil 0 er indtastet
        // udskriv resultaterne
        int[] numberOccurences = new int[101];

        System.out.println("Enter numbers between 1 and 100 (enter 0 to stop):");

        Scanner scanner = new Scanner(System.in);

        int number = -1; // Brug denne variable til at gemme de indtastede tal
        while (number != 0) {
            number = scanner.nextInt();
            numberOccurences[number] = numberOccurences[number] + 1;
        }
        System.out.println(Arrays.toString(numberOccurences));

        for (int i = 1; i < numberOccurences.length; i++) {
            if (numberOccurences[i] != 0) {
                String postFix = " gang";
                if(numberOccurences[i] > 1){
                    postFix += "e";
                }
                System.out.println(i + " forekommer " + numberOccurences[i] + postFix);
            }
        }
    }
}