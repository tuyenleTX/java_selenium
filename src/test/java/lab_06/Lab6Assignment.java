package lab_06;
//1. Given input string "2hrs and 5 minutes". Please calculate how many minutes in total
//2. String myPassword = "password123", allow user input 3 times
//3. String myStr = "100 minutes". Not using REGEX, extract digits from that string. Expected: 100. Example: "123456abc789" => "123456789"
//4. String url = "https://google.com", check https or http, domain name is .com or net

import java.util.Arrays;
import java.util.Scanner;

public class Lab6Assignment {
    public static void main(String[] args) {
        int total = totalMinutes("2hrs and 5 minutes");
        System.out.println("minutes in total: " + total);
        checkInputPassword("password123",3);
        System.out.println("Extract digits from a string: " + extractDigits("123456abc789"));
        checkIfURLValid("https://google.com");
    }

    public static int totalMinutes(String strHoursAndMinutes) {
        String[] nHoursAndMinutes = strHoursAndMinutes.split(" and ");
        System.out.println(Arrays.toString(nHoursAndMinutes));
        int hours = Integer.parseInt(nHoursAndMinutes[0].replaceAll("[^0-9]", ""));
        System.out.println(hours);
        int minutes = Integer.parseInt(nHoursAndMinutes[1].replaceAll("[^0-9]", ""));
        System.out.println(minutes);

        return hours*60 + minutes;
    }

    public static void checkInputPassword(String passWord, int nInputTime) {
        if(nInputTime > 0) {
            while (nInputTime > 0) {
                System.out.println("Please input your password: ");
                Scanner scanner = new Scanner(System.in);
                String inputPassword = scanner.next();
                if (!inputPassword.equals(passWord)) {
                    nInputTime--;
                    System.out.println("Sorry, wrong password!");
                } else {
                    System.out.println("Congrats");
                    break;
                }
            }
            if (nInputTime == 0) {
                System.out.println("You are locked, please contact administrator!");
            }
        } else {
            System.out.println("Wrong input number of time, please input the right number!");
        }
    }

    public static String extractDigits(String strInput) {
        String newString = "";
        for(char i : strInput.toCharArray()) {
            if(Character.isDigit(i))
                newString = newString.concat(Character.toString(i));
        }
        return newString;
    }

    public static void checkIfURLValid(String url) {
        if((url.contains("https") || url.contains("http")) && (url.contains(".com") || url.contains(".net"))) {
            System.out.println("Valid URL");
        } else
            System.out.println("Invalid URL");
    }
}


