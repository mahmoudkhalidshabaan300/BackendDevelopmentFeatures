// https://edabit.com/challenge/ZuoKAgmH8G2vHtLzi 
public class ReturnSomethingToMe{
    public static String returnSomething(String moodSentence){
        return "SomeThing " + moodSentence;
    }
    public static void main(String args[]){
        String result = returnSomething("Is Better Than NoThing...");
        System.out.println(result);
    }
}