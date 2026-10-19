// https://edabit.com/challenge/B4HjZbBh9yuELmjna
public class DisplayingAreaOfTraingle{
    public static float getTraingleArea(float traingleHeight , float traingleBase){
        float traingleArea = (traingleBase * traingleHeight) / 2.0f;
        return traingleArea;
    }
    public static void main(String[] args){
        float result = getTraingleArea(10 , 5);
        System.out.println(result);
    }
}