// https://edabit.com/challenge/L53ZXmSb32TCSkciE
public class DisplayingFeetsFromInches{
    public static int inchesToFeet(int inches){
        System.out.println("The Total Inches Is = "+inches);
        int feetsToInches = inches / 12;

        if(inches < 12){
            System.out.print("The Total Number Of Feets Is = ");
            return 0;
        }
        else{
            System.out.print("The Total Number Of Feets Is = ");
            return feetsToInches;
        }
    }
    public static void main(String[] args){
        int result = inchesToFeet(324);
        System.out.print(result);
    }
}