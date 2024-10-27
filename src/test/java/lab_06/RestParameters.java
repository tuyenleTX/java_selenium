package lab_06;

public class RestParameters {
    public int sum(int... numbers){
        int total = 0;
        for (int i: numbers
             ) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        RestParameters restParameters = new RestParameters();
        System.out.println(restParameters.sum(1, 2));
        System.out.println(restParameters.sum(1, 2, 3));
        System.out.println(restParameters.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    }
}
