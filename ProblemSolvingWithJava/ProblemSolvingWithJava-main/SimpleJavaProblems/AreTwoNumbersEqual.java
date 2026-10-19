// https://edabit.com/challenge/gdRGePvnZDfQGDS8g
public class AreTwoNumbersEqual{
    public static boolean IsEqual(int fristNumber , int secondNumber){
        if(fristNumber == secondNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean checkEquality = IsEqual(10 , 20);
        System.out.println(checkEquality);
    }
}