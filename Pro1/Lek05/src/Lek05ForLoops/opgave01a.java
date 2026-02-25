package Lek05ForLoops;

public class opgave01a {
    static void main(String[] args) {
        System.out.println("Alle ulige tal mellem 1 og 99 er:");
        for (int digits = 1; digits <= 99; digits++) {
            if (digits % 2!= 0) {
                System.out.println(digits);
            }
        }
    }
}