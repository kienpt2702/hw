package Part1;

public class Task2_3 {
    public String solve2(int num){
        if(num >0){
            return "pos";
        }
        if(num <0){
            return "neg";
        }
        return "zero";
    }
    public String solve3(int n1, int n2, int n3){
        if(n1 < n2 && n2 < n3){
            return "increase";
        }
        if(n1 > n2 && n2 > n3){
            return "decrease";
        }
        return "nothing";
    }
}
