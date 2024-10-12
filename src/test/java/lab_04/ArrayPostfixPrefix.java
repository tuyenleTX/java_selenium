package lab_04;

public class ArrayPostfixPrefix {
    public static void main(String[] args) {
        int[] arrSample = {9,9,9,9,9};

        for (int i = 0; i < arrSample.length; i ++) {
            //arrSample[i] = ++i; //1 9 3 9 5
            arrSample[i] = i++; //0 9 2 9 4
        }
        for (int value: arrSample
             ) {
            System.out.println(value);
        }
    }
}
