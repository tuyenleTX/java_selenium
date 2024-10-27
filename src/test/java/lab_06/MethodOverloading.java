package lab_06;

public class MethodOverloading {
    //Method Overloading: Compile Time, same name but different parameters (not relates to return type or access modifier
    //Method Overriding: Run Time
    public int sum(int a, int b){
        return a + b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.sum(1, 2));
        System.out.println(methodOverloading.sum(1, 2, 3));
    }
}
