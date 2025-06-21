package practise_coding;

import java.lang.reflect.Array;

//Write a program to take an array of integers as input and calculate the sum of all elements in the array.
public class SumOfElements {
    public static void main(String[] args) {
        int[] a = {1,5,3,9,8};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
