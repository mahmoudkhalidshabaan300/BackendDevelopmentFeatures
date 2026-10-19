// https://edabit.com/challenge/5gpukjfi5rAH8MvKF
public class AreTheNumbersEqual{
    public static boolean isTheSameTwoNumbers(int fristNumber , int secondNumber){
        if(fristNumber == secondNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result = isTheSameTwoNumbers(10 , 10);
        System.out.println(result);
    }
}