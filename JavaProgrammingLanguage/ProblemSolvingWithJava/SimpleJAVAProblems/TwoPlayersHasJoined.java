// https://edabit.com/challenge/ccv2_2dcf7fb10f2674a6601f4c16
public class TwoPlayersHasJoined{
    public static String joinMessage(String userName){
        System.out.println("The User Name Is : ");
        System.out.println(userName);
        String newUserName = "";
        if((userName.length() >= 1) && (userName.length() <= 20)){
            newUserName = userName + " Has Joined...";
            return newUserName;
        }
        else{
            newUserName = userName + " Has Not Joined...";
            return newUserName;
        }
    }
    public static void main(String[] args){
        String checkJoining = joinMessage("Mahmoud123");
        System.out.print(checkJoining);
    }
}