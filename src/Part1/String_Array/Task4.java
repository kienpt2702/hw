package Part1.String_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static double findMedian(int[] arr){
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            return ((arr[arr.length/2]+ arr[arr.length/2-1])/2.0);
        }
        return arr[arr.length/2];
    }
    public static int mostCommon(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int mostCommon = 0;
        int maxCount = 0;
        for(int i: arr){
            Integer currCount = map.get(i);
            if(currCount == null){
                map.put(i,1);
            }
            else {
                map.put(i,currCount+1);
            }
            int newCount = map.get(i);
            if(newCount > maxCount){
                mostCommon = i;
                maxCount = newCount;
            }
        }
        return mostCommon;
    }
    public static void main(String[] args) {
        int[] arr = {3, 13, 7, 5, 21, 23, 39, 23, 40, 23, 14, 12, 56, 23, 29};
        System.out.println(findMedian(arr)); // 23
        int[] ar = {1,2,3,3,3,2,1,1,2,3,4,1,2,1,23,5,123,1};
        System.out.println(mostCommon(ar));
    }
}
