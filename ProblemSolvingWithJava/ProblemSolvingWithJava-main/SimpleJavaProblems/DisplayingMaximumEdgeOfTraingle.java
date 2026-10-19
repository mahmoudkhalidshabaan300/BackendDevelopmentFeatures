// https://edabit.com/challenge/zBhuXyFeSQdizC5LW
public class DisplayingMaximumEdgeOfTraingle{
    public static int getMaximumEdgeOfTraingle(int fristSide , int secondSide){
        int maximumEdgeTraingle = fristSide + secondSide - 1;
        return maximumEdgeTraingle;
    }
    public static void main(String[] args) {
        int result = getMaximumEdgeOfTraingle(10 , 8);
        System.out.println(result);
    }
}