package lab_05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i)%2 == 1){
                myList.set(i, myList.get(i) + 1);
            }
        }
        System.out.println(myList);

        int currentSize = myList.size();
        for (int i = 0; i < currentSize; i++) {
            if(myList.get(i) == 4){
                myList.remove(new Integer(4));
                currentSize --;
                i --;
            }
        }
        System.out.println(myList);
    }
}
