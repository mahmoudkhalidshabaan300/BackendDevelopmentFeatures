public class FootBallPoints{
    public static int totalPoints(int winningMatches , int drawingMatches , int lossingMatches){
        System.out.println("The Total Winning Matches Is = "+winningMatches);
        System.out.println("The Total Drawing Matches Is = "+drawingMatches);
        System.out.println("The Total Loosing Matches Is = "+lossingMatches);
        int points = winningMatches * 3 + drawingMatches * 1 + lossingMatches * 0;
        System.out.print("The Total Points Of All Matches Is = ");
        return points;
    }
    public static void main(String[] args){
        int result = totalPoints(3 , 4 , 2);
        System.out.print(result);
    }
}