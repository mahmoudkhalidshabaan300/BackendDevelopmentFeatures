// https://edabit.com/challenge/BeW6HMLCfGzHxkzbe
public class FixTheExpression{
    public static boolean checkIfIsSevenOrNot(int num){
        System.out.println("The Number Is = "+num);
        System.out.println("The Number Is Seven : ");
        if(num == 7){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean result = checkIfIsSevenOrNot(7);
        System.out.println(result);
    }
}