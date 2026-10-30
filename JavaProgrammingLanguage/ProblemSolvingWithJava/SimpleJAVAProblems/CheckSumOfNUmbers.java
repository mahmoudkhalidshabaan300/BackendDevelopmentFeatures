// https://edabit.com/challenge/FSKb2sKrGoejfJLrd
public class CheckSumOfNumbers{
    public static boolean isLessThan100(int fristNumber , int secondNumber){
        System.out.println("The Frist Number Is = "+fristNumber);
        System.out.println("The Second Number Is = "+secondNumber);
        int sumOfTwoNumbers = fristNumber + secondNumber;
        System.out.println("The Sum Of The Two Numbers Is = "+sumOfTwoNumbers);
        System.out.println(sumOfTwoNumbers);
        System.out.println("The Sum Of The Two Numbers Is Less Than 100 Is : ");
        if(sumOfTwoNumbers < 100){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean result = isLessThan100(22 , 15);
        System.out.println(result);
    }
}