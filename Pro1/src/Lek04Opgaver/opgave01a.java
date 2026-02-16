package Lek04Opgaver;

public class opgave01a {

    static void main(String[] args) {
        int i = 2;  // variabel der starter på 2
        int sum = 0; // variabel der holder styr på summen

        // loop der kører imens i er mindre end 100
        while (i < 100) {
            if (i % 2 == 0) { // Boolean sikre tallet er lige og lægger det til sum
                sum += i; // lægger i til sum. Også skrevet sum = sum + i;
            }
            i++; // øg i med 1
        }
        System.out.println(sum); // printer sum
    }
}
