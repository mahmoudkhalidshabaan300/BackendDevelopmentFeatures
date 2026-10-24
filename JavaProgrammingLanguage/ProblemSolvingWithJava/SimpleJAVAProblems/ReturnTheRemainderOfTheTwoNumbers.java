// https://edabit.com/challenge/RNMKdSEhxdxf2fWsa
public class ReturnTheRemainderOfTheTwoNumbers{
    public static int remainderOfNums(int fristNumber , int secondNumber){
        System.out.println("The Frist Number Is = "+fristNumber);
        System.out.println("The Second Number Is = "+secondNumber);
        int remainderOfNumbers = fristNumber % secondNumber;
        // System.out.("The Remainder Between The Two Numbers Is = "+remainderOfNumbers);
        return remainderOfNumbers;
    }
    public static void main(String[] args){
        int remainder = remainderOfNums(10 , 5);
        System.out.print("The Remainder Of The Two Numbers Is = "+remainder);
    }
}