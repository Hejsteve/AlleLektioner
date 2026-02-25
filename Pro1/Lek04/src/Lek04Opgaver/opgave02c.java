package Lek04Opgaver;

public class opgave02c {

    public static void main(String[] args) {
        sumOddDigits(1234567); // Når metoden bliver kaldt får den 1234567 at arbejde med
        System.out.println(sumOddDigits(1234567)); // Printer resultatet
    }

    public static int sumOddDigits(int number) { // bruger int så main kan modtage et tal fra metoden
        int sum = 0; // holder styr på summen af ulige cifre

        while (number > 0) { // løkken kører så længe number er større end 0
            int digits = number % 10; // Henter det sidte tal i rækken

            if (digits % 2!= 0) { //tjekker om tallet er ulige
                sum += digits; // lægger de ulige tal til summen
            }
            number = number / 10; // dividere og fjerner det sidte cifre i rækken fordi integer fjerner decimal tal
        }
        return sum; // returnere summen af alle ulige tal
    }
}
