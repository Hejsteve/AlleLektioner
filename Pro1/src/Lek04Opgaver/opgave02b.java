package Lek04Opgaver;

public class opgave02b {

    static void main(String[] args) {
        sumEvenInts(7, 25); // Når metoden bliver kaldt får den 7 og 25 at arbejde med
        System.out.println(sumEvenInts(7, 25)); // printer resultatet
    }
        public static int sumEvenInts(int lower, int upper) { // Kalder tallenen fra main metoden
        int sum = 0; // holder styr på summen

        while (lower <= upper) { //Køre så længe lower er mindre eller lig med upper
            if (lower % 2 == 0) { // Tjekker om tallet er lige
                sum += lower; // lægger de lige tal oven i summen
            }
            lower++; // øger lower med 1
        }
        return sum; // returnere summen når løkken er færdig
    }
}
