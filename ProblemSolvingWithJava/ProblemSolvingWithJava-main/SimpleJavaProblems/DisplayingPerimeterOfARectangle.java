// https://edabit.com/challenge/cMKLM7ExBd3TFJwPA
public class DisplayingPerimeterOfARectangle{
    public static int perimeterOfARectangle(int RectangleLength , int RectangleWidth){
        int rectanglePerimeter = 2 * (RectangleLength + RectangleWidth);
        return rectanglePerimeter;
    }
    public static void main(String[] args){
        int result = perimeterOfARectangle(2 , 9);
        System.out.println(result);
    }
}