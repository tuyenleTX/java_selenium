package algorithms;

public class IsPalindrome {
    public static void main(String[] args) {
        boolean result = isPalindrome(121);
        System.out.println(result);
    }
    public static boolean isPalindrome(int num){
        boolean flag = true;
        String test = String.valueOf(num);
        for(int i = 0; i < test.length()/2; i ++){
            if(test.charAt(i) != test.charAt(test.length() -1 - i))
                flag = false;
        }
        return flag;
    }
}
