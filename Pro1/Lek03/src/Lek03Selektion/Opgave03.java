package Lek03Selektion;

import java.util.Scanner;

public class Opgave03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("The number is growing");
        } else if (a > b && b > c)
            System.out.println("The number is declining");
        else
            System.out.println("Neither growing or declinging");
    }
}
