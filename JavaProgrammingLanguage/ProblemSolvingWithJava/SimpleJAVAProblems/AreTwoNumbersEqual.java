// https://edabit.com/challenge/gdRGePvnZDfQGDS8g
public class AreTwoNumbersEqual{
    public static boolean checkEquality(int fristNumber , int secondNumber){
        System.out.println("The Frist Number Is = "+fristNumber);
        System.out.println("The Second Number Is = "+secondNumber);
        if(fristNumber == secondNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean AreNumsEqual = checkEquality(10 , 10);
        System.out.println(AreNumsEqual);
    }
}