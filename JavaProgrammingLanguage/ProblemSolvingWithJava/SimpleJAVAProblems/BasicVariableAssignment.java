// https://edabit.com/challenge/Phy3ESenwRH6KNytm
public class BasicVariableAssignement{
    public static String concatenationUserNameWithEdabit(String userName){
        System.out.println("The User Name Is : "+userName);
        System.out.println("The User Name With Edabit Is : ");
        return userName + "Edabit";
    }
    public static void main(String[] args){
        String stringName = concatenationUserNameWithEdabit("Java");
        System.out.println(stringName);
    }
}