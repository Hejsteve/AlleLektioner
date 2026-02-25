package Lek03Selektion;

import java.util.Scanner;

public class Opgave02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i < 0) {
            System.out.println("The number is negative");
        } else if (i == 0)
            System.out.println("the number is zero");
        else if (i > 0)
        System.out.println("The number is positive");

    }
}
