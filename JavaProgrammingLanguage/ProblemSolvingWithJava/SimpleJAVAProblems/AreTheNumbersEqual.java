// https://edabit.com/challenge/5gpukjfi5rAH8MvKF
public class AreTheNumbersEqual{
    public static boolean checkIfNumbersEqual(int fristNumber , int secondNumber){
        System.out.println("The Frist Number Is "+fristNumber+"\n, And The Second Number Is = "+secondNumber);
        if(fristNumber == secondNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean checkEquality = checkIfNumbersEqual(10 , 10);
        System.out.print(checkEquality);
    }
}