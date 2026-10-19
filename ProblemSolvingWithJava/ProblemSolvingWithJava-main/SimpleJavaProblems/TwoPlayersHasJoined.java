// https://edabit.com/challenge/ccv2_2dcf7fb10f2674a6601f4c16
public class TwoPlayersHasJoined{
    public static String checkJoinedOrNot(String userName){
        if((userName.length() >= 1 && userName.length() <= 20)){
            return userName + " Has Joined...";
        }
        else{
            return userName + " Has Not Joined...";
        }
    }
    public static void main(String[] args){
        String checkJoined = checkJoinedOrNot("Mahmoud123");
        System.out.println(checkJoined);
    }
}