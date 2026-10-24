// https://edabit.com/challenge/EP66YmuNMWhRZdniY
public class IsTheNumberEqualOrLessThanZero{
    public static boolean checkNumber(int number){
        System.out.print("The Number Is = "+number+"\n");
        if((number <= 0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean checkNum = checkNumber(10);
        System.out.println(checkNum);
    }
}