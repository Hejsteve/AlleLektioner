package Lek06Arrays;

public class opgave02 {
    static void main(String[] args) {

        int sum = 0;
        int[] numbers = {4, 6, 7, 2, 3};
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Summen af tallene er: " + sum);
    }
}

