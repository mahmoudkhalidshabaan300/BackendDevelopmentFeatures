// https://edabit.com/challenge/ZuoKAgmH8G2vHtLzi
public class ReturnSomethingToMe{
    public static String DisplayingSomethingToMe(String displayingSomething){
        String DisplayingSomethingToMe = "Something" + displayingSomething;
        return DisplayingSomethingToMe;
    }
    public static void main(String[] args) {
        String result = DisplayingSomethingToMe(" Is Better Than Nothing...");
        System.out.println(result);
    }
}