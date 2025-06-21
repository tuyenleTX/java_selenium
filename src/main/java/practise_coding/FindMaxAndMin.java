package practise_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] a = {1,3,5, 0, 9, -1};
        List<Integer> b = new ArrayList<Integer>();
        //Arrays.stream(a).sorted();
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
    }
}
