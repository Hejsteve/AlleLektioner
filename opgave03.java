package Opgaver;

import java.util.Arrays;

public class opgave03 {
    static void main(String[] args) {
        int[] a = {4,6,7,2,3};
        int[] b = {4,6,8,2,6};
        int[] c = new int[5];

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + b[i];
            c[i] = sum;
            System.out.println(Arrays.toString(c));
        }
    }
}
