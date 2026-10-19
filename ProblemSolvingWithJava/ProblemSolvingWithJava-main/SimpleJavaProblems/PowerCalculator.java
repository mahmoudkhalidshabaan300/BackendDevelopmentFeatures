// https://edabit.com/challenge/6MTtawFBLqDRSqiSf
public class PowerCalculator{
    public static int GettingPower(int voltage , int current){
        int power = voltage * current;
        return power;
    }
    public static void main(String[] args) {
        int result = GettingPower(230 , 10);
        System.out.println(result);
}}