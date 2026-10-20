// https://edabit.com/challenge/DmFnzAQzWhyRWdKPi
public class convertHoursIntoSeconds{
    public static int getSeconds(int hours){
        System.out.println("The Total Hours Is = "+hours);
        int totalSeconds = hours * 60 * 60;
        return totalSeconds;
    }
    public static void main(String[] args){
        int secondsFromHours = getSeconds(24);
        System.out.print("The Total Seconds Is = "+secondsFromHours);
    }
}