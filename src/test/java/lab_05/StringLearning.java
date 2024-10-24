package lab_05;

public class StringLearning {
    public static void main(String[] args) {
        String name1 = "Teo";
        String name2 = "Teo";
        String name3 = new String("Teo");
        System.out.println("name1 == name2: " + (name1.equals(name2)));
        System.out.println("name1 == name3: " + name1.equals(name3));
        String passWord = "123myPassword";
        char[] chars = passWord.toCharArray();
        int nNum = 0;
        int nLowerCase = 0;
        int nUpperCase = 0;
        for (char aChar : chars) {
            if(Character.isDigit(aChar)) nNum ++;
            else if (Character.isLowerCase(aChar)) nLowerCase ++;
            else if (Character.isUpperCase(aChar)) nUpperCase ++;
        }
        if(nNum > 0 && nLowerCase > 0 && nUpperCase > 0)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
