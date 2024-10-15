package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> sample = new ArrayList<>();
        sample.add(1);
        sample.add(2);
        sample.add(0, 3);
        for (int i = 0; i < sample.size(); i++) {
            if (sample.get(i) % 2 == 1) {
                sample.set(i, sample.get(i) + 1); //4, 2, 2
            }
        }
        for (int value : sample) {
            System.out.println(value);
        }

        /*
         * 1. Add number ArrayList
         * 2. Print numbers
         * 3. Get maximum number
         * 4. Get minimum number
         * 5. Search number: optional: add option number 5 to find a number -> index
         * */
        List<Integer> numbers = new ArrayList<>();
        int random = 0;
        for(int index = 0; index < 5; index ++) {
            random = new SecureRandom().nextInt(10);
            numbers.add(random);
        }

        for(int j = 0; j < numbers.size(); j ++) {
            System.out.println(numbers.get(j));
        }

        int min = numbers.get(0);
        int max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i ++) {
            if(numbers.get(i) < min) min = numbers.get(i);
            if(numbers.get(i) > max) max = numbers.get(i);
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);

        System.out.println("Please input a number: ");
        int userNumber = new Scanner(System.in).nextInt();
        boolean flag = false;

        for(int a = 0; a < numbers.size(); a ++){
            if(numbers.get(a) == userNumber) {
                System.out.println("The number user inputted is at index: " + a);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Cannot find the number user inputted");
        }
    }


}
