// https://edabit.com/challenge/RNMKdSEhxdxf2fWsa
public class ReturnTheRemainderOfTheTwoNumbers{
    public static int returnTheRemainder(int fristNumber , int secondNumber){
        int remainderFromTwoNumbers = fristNumber % secondNumber;
        return remainderFromTwoNumbers;
    }
    public static void main(String[] args){
        int remainder = returnTheRemainder(10 , 6);
        System.out.println(remainder);
    }
}