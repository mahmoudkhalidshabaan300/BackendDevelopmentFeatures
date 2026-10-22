// https://edabit.com/challenge/cMKLM7ExBd3TFJwPA
public class DisplayingPerimeterOfARectangle{
    public static int rectanglePerimeter(int rectangleLength , int rectangleWidth){
        System.out.print("The Rectangle Length Is = "+rectangleLength+"\n,And The Rectangle Width Is = "+rectangleWidth);
        int gettingRectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
        return gettingRectanglePerimeter;
    }
    public static void main(String[] args){
        int perimeter = rectanglePerimeter(2 , 9);
        System.out.print("\nThe Perimeter Of The Rectangle Is = \t"+perimeter);
    }
}