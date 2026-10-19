// https://edabit.com/challenge/XJxu5LCnqN9K8SXm5
public class UpVotesVSDownVotes{
    public static int differenceBetweenUpAndDown(int upVotes , int downVotes){
        int differenceBetweenVotes = upVotes - downVotes;
        return differenceBetweenVotes;
    }
    public static void main(String[] args) {
        int result = differenceBetweenUpAndDown(2 , 33);
        System.out.println(result);
    }}