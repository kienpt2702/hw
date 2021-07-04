package Part1.String_Array;

import java.util.ArrayList;

public class Task2 {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("abcdef"));
    }
}
