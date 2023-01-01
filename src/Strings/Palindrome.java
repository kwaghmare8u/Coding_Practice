package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "radar", reverseStr = "";
        for (char ch : str.toCharArray()){
            reverseStr = ch + reverseStr;
        }
        if (str.equalsIgnoreCase(reverseStr)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }
}
