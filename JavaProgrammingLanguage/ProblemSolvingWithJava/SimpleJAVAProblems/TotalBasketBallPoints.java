// https://edabit.com/challenge/3MqevrgExMbgmBrLG
public class TotalBasketBallPoints{
    public static int displayingPoints(int twoPointers , int threePointers){
        System.out.println("The Two Pointers Value Is = "+twoPointers);
        System.out.println("The Three Pointers Value Is = "+threePointers);
        int totalPoints = twoPointers * 2 + threePointers * 3;
        System.out.print("The Total BasketBall Point Of Different Pointers Is = ");
        return totalPoints;
    }
    public static void main(String[] args){
        int result = displayingPoints(12 , 13);
        System.out.println(result);
    }
}