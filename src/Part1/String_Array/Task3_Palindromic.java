package Part1.String_Array;

import java.util.Scanner;

public class Task3_Palindromic {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void checkPalindromic(String s){
        String reverseString = reverse(s);
        if(s.equalsIgnoreCase(reverseString)){
            System.out.println(s+ " is a palindrome");
        }
        else{
            System.out.println(s + " is not");
        }
    }

    public static void main(String[] args) {
        System.out.println("type word:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        checkPalindromic(s);
    }
}
