package lab_04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> sample = new ArrayList<>();
        sample.add(1);
        sample.add(2);
        sample.add(0, 3);
        for (int i = 0; i < sample.size(); i++) {
            if (sample.get(i) % 2 == 1) {
                sample.set(i, sample.get(i) + 1);
            }
        }
        for (int value : sample) {
            System.out.println(value);
        }
    }

    /*
    * 1. Add number ArrayList
    * 2. Print numbers
    * 3. Get maximum number
    * 4. Get minimum number
    * 5. Search number: optional: add option number 5 to find a number -> index
    * */
}
