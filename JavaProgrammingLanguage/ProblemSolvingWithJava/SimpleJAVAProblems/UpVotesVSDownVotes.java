// https://edabit.com/challenge/XJxu5LCnqN9K8SXm5
public class UpVotesVSDownVotes{
    public static int getVoteCount(int upVotes , int downVotes){
        System.out.println("The Total Up Votes Is = "+upVotes+"\n, And The Total Down Votes Is = "+downVotes);
        int totalVotes = downVotes - upVotes;
        System.out.print("The Total Votes Is = \t");
        return totalVotes;
    }
    public static void main(String[] args){
        int votes = getVoteCount(33 , 2);
        System.out.print(votes);
    }
}