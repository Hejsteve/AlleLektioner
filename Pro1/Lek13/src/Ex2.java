import java.util.ArrayList;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);

        System.out.println("ints: " + ints);
        System.out.println();

        int total = sum1(ints);
        System.out.println("Sum: " + total);
        System.out.println();

        int sum = sum(ints);
        System.out.println("Sum of list: " + sum);
        System.out.println();

        int min = minimum(ints);
        System.out.println("Minimum: " + min);
        System.out.println();

        int max = maximum(ints);
        System.out.println("Maximum: " + max);
        System.out.println();

        double avg = average(ints);
        System.out.println("average: " + avg);
        System.out.println();

        int zero = zeroes(ints);
        System.out.println("Number of zeroes: " + zero);
        System.out.println();

        ArrayList<Integer> evenNumbers = evens(ints);
        System.out.println("Evens: " + evenNumbers);
        System.out.println();


    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static int minimum(ArrayList<Integer> list) {
        int min = list.get(0);

        for (int number : list) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int maximum(ArrayList<Integer> list) {
        int max = list.get(0);

        for (int number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        double avg = sum / list.size();

        return avg;
    }

    public static int zeroes(ArrayList<Integer> list) {
        int counter = 0;

        for (int number : list) {
            if (number == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static ArrayList<Integer> evens(ArrayList<Integer> list) {
        ArrayList<Integer> evens = new ArrayList<>();

        for (int number : list) {
            if (number % 2 == 0) {
                evens.add(number);
            }
        }
        return evens;
    }

    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }
}