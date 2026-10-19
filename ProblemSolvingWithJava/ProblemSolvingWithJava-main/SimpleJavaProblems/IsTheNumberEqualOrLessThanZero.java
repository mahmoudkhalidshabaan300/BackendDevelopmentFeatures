// https://edabit.com/challenge/EP66YmuNMWhRZdniY
public class IsTheNumberEqualOrLessThanZero{
    public static boolean checkTheNumber(float number){
        if(number > 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        boolean result = checkTheNumber(20.34f);
        System.out.println(result);
    }
}