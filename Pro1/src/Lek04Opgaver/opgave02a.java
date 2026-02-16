package Lek04Opgaver;

public class opgave02a {

    static void main(String[] args) {
        printPowersOfTwo();
    }
    public static void printPowersOfTwo() {
        int i = 1;
        int counter = 0;

        while (counter <= 20) {
            System.out.println(i);
            i = i * 2;
            counter++;
        }
    }
}
