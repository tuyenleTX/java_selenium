package lab_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "PCCC");
        emergencyList.put(114, "CSCD");
        emergencyList.put(115, "HS");
        emergencyList.put(116, "Others");
        emergencyList.replace(116, "Others", "Something Else!" );
        emergencyList.remove(116);
        for (int key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
}
