// https://edabit.com/challenge/ccv2_a1961ffda5157d645f670f7c
public class RetryOrStop{
    public static boolean retOrStop(boolean failed , int attempts , int limits){
        System.out.println("The Failed Status Is : ");
        System.out.print(failed+"\n");
        System.out.println("The Total Attempts Is = ");
        System.out.print(attempts+"\n");
        System.out.println("The Total Limits Is = ");
        System.out.print(limits+"\n");
        System.out.print("Check Retry Or Stop Is : ");
        if((failed == false) && (attempts < limits)){
            return false;
        }
        else if((failed == true) && (attempts > limits)){
            return false;
        }
        else if((failed == true) && (attempts == limits)){
            return false;
        }
        else if((failed == false) && (attempts == limits)){
            return false;
        }
        else if((failed == false) && (attempts < limits)){
            return false;
        }
        else if((failed == true) && (attempts < limits)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean checkRetryOrStop = retOrStop(false , 5 , 5);
        System.out.println(checkRetryOrStop);
    }
}