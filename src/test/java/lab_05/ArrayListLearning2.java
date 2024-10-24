package lab_05;

import java.util.*;

public class ArrayListLearning2 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(4);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(4);
        myList.add(4);
        System.out.println("Initial list: " + myList);
        //Question: remove duplicated in the list

        //Case 1: remove duplicated numbers then use Collections.sort() method
        /*List<Integer> newList = new ArrayList<>();
        for (int value:myList) {
            if(!newList.contains(value))
                newList.add(value);
        }
        System.out.println(newList);

        Collections.sort(myList);
        System.out.println(myList);*/

        //Case 2: use Set - it will remove duplicated numbers and sort the list
        Set<Integer> newSortedList = new HashSet<>(myList);
        System.out.println("New sorted list not including duplicated numbers:" + newSortedList);

        //Question 4: Convert Set to List then get the first 3 smallest numbers
        List<Integer> convertedList = new ArrayList<>(newSortedList);
        //case 1:
        List<Integer> arrOf3 = new ArrayList<>();
        for(int i = 0; i < 3; i ++) {
            arrOf3.add(convertedList.get(i));
        }
        System.out.println("3 smallest numbers: " + arrOf3);
        //case 2:
        List<Integer> newArrOf3 = convertedList.subList(0,3);
        System.out.println(newArrOf3);

    }
}
