// https://edabit.com/challenge/2t8JDxF7wLrg7yJ5E
public class ConvertMinutesIntoSeconds{
    public static int MinutesIntoSeconds(int minutes){
        return minutes * 60;
    }
    public static void main(String[] args){
        int result = MinutesIntoSeconds(5);
        System.out.println(result);
    }
}