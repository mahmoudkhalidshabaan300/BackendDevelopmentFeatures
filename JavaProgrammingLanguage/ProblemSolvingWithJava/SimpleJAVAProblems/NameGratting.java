// https://edabit.com/challenge/JAtN6KLtahAkmT3n3
public class NameGretting{
    public static String helloName(String userName){
        System.out.println("The User Name Is : "+userName)
        return "Hello " + userName;
    }
    public static void main(String[] args){
        String result = helloName("Gerald");
        System.out.print(result);
    }
}