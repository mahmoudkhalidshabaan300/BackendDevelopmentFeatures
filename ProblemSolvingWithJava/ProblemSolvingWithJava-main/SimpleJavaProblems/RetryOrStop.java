// https://edabit.com/challenge/ccv2_a1961ffda5157d645f670f7c
public class RetryOrStop{
    public static boolean checkRetryOrStop(boolean failed , int attempets , int limits){
        if((attempets < limits) && (failed == false)){
            return false;
        }
        else if((attempets < limits) && (failed == true)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean checkFailed = checkRetryOrStop(true , 2 , 3);
        System.out.println(checkFailed);
    }
}