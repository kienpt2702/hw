package Part1.Looping;

public class Task2 {
    public static void loop1(){
        int sum = 0;
        for(int i= 1; i<= 10; i++){
            System.out.println(sum += i);
        }
    }
    public static void loop2(){
        int sum = 0;
        int i = 1;
        while (sum + i <= 100){
            System.out.println(sum += i);
            i++;
        }
    }

    public static void main(String[] args) {
        loop1();
        loop2();
    }
}
