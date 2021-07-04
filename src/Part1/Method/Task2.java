package Part1.Method;

public class Task2 {
    public static void IncomeTaxCalculator(int in){
        double tax = 0;
        for(int i =0; i <= 3; i++){
            int remain = in - 20000;
            if(remain >= 0 && i <3){
                tax += 20000 * 0.1 * i;
                in = remain;
            }
            else{
                tax += in * 0.1 * i;
                break;
            }
        }
        System.out.println(tax);
    }
    public static int exponent(int base, int exp){
        if(exp ==0){
            return 1;
        }
        int ans = 1;
        for(int i =1; i <= exp; i++){
            ans *= base;
        }
        return ans;
    }

    public static void main(String[] args) {
        IncomeTaxCalculator(67891);
        System.out.println(exponent(3,4));
    }
}
