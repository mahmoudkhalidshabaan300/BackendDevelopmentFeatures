// https://edabit.com/challenge/ZdHBAkK9qfFCNKfPQ
public class SumOgPolygonAngles{
    public static int totalPolygonAngles(int numberOfAngles){
        System.out.println("The Number Of Angles Is = "+numberOfAngles);
        int polygonAngles = (numberOfAngles - 2) * 180;
        String error = "Please Enter A Valid Numbers Of Angles";
        if(numberOfAngles > 2){
            System.out.print("The Total Numbers Of The Polygon Angles Is = ");
            return polygonAngles;
        }
        else{
            System.out.println(error);
            System.out.print("No Total Polygon Angles , Because The Number Of Angles Is = ");
            return numberOfAngles;
        }
    }
    public static void main(String[] args){
        int result = totalPolygonAngles(6);
        System.out.println(result);
    }
}