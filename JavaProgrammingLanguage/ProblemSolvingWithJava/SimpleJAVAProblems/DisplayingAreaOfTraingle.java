// https://edabit.com/challenge/B4HjZbBh9yuELmjna
public class DisplayingAreaOfTraingle{
    public static float returnTraingleArea(float traingleBase , float traingleHeight){
        System.out.println("The Traingle Base Is = "+traingleBase);
        System.out.println("The Traingle Height Is = "+traingleHeight);
        float traingleArea = (traingleBase * traingleHeight) / 2.0f;
        return traingleArea;
    }
    public static void main(String[] args){
        float result = returnTraingleArea(10 , 40);
        System.out.println(result);
    }
}