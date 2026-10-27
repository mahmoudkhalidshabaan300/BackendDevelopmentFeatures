// https://edabit.com/challenge/eqcCH2WbEXFLDyiQi
public class ConvertAgeToDays{
    public static int ageToDays(int ageIntoYears){
        System.out.println("The Age Into Years Is = "+ageIntoYears+"...");
        int ageIntoDays = ageIntoYears * 365;
        System.out.print("The Age Into Days Is = ");
        return ageIntoDays;
    }
    public static void main(String[] args){
        int days = ageToDays(65);
        System.out.print(days);
    }
}