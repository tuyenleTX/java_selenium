package practise_coding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, -3, 8, 5};
        int temp = 0;
        Arrays.sort(arr);
//        for(int i = 0; i < arr.length - 1; i ++) {
//            for (int j = i + 1; j < arr.length; j ++) {
//                if(arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        for (int k = 0; k < arr.length; k ++) {
            System.out.print(arr[k] + " ");
        }
    }
}
