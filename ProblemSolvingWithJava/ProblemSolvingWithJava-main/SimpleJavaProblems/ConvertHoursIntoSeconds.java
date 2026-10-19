// https://edabit.com/challenge/DmFnzAQzWhyRWdKPi
public class ConvertHoursIntoSeconds{
    public static int getSeconds(int hours){
        int secondsFromHours = hours * 60 * 60;
        return secondsFromHours;
    }
    public static void main(String[] args) {
        int seconds = getSeconds(2);
        System.out.println(seconds);
}}