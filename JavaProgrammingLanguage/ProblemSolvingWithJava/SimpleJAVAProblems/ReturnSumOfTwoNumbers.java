// https://edabit.com/challenge/8Ty2vq2YtcBp6CFc8
public class ReturnSumOfTheTwoNumbers{
    public static int sumOfTwoNumbers(int fristNumber , int secondNumber){
        System.out.println("The Frist Number Is = "+fristNumber);
        System.out.println("The Second Number Is = "+secondNumber);
        int sumOfNumbers = fristNumber + secondNumber;
        return sumOfNumbers;
    }
    public static void main(String[] args){
        int sumOfNums = sumOfTwoNumbers(3 , 7);
        System.out.println("The Sum Of The Two Numbers Is = "+sumOfNums);
    }
}