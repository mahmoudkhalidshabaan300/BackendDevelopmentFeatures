// https://edabit.com/challenge/2t8JDxF7wLrg7yJ5E
public class ConvertMinutesIntoSeconds{
    public static int getSecondsFromMinutes(int NumberOfMinutes){
        System.out.println("Total Numbers Of Minutes Is : "+NumberOfMinutes);
        int secondsFromMinutes = NumberOfMinutes * 60;
        return secondsFromMinutes;
    }
    public static void main(String[] args){
        int seconds = getSecondsFromMinutes(5);
        System.out.println("The Number Of Seconds Is = "+seconds);
    }
}