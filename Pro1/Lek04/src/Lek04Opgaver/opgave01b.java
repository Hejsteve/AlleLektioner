package Lek04Opgaver;

public class opgave01b {
    public static void main(String[] args) {
        int i = 1; // variabel der starter på 1
        int sum = 0; // variabel der holder styr på summen
        int limit = 100; // grænsen for kvadrattallet

        // loop der kører imens i^2 er mindre end eller lig med limit
        while (i * i <= limit) {
            sum += i * i;// læg i^2 til summen
            i++; // øg i med 1
        }
        // print summen af kvadrattallene
        System.out.println(sum);
    }
}
