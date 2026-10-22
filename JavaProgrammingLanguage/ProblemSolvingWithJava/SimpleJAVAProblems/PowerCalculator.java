// https://edabit.com/challenge/6MTtawFBLqDRSqiSf
public class PowerCalculator{
    public static int powerOfNumber(int number){
        System.out.println("The Number Is = "+number);
        int powOfNum = number * number;
        return powOfNum;
    }
    public static void main(String[] args){
        int result = powerOfNumber(10);
        System.out.println("The Power Of The Number Is = "+result);
    }
}