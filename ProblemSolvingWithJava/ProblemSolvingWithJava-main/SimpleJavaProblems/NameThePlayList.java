// https://edabit.com/challenge/ccv2_cd68bfdcfa174dbeb6e3cd5a
public class NameThePlayList{
    public static String nameList(String mood){
        return mood + " " +"Mix.";
    }
    public static void main(String[] args){
        String result = nameList("Late Night");
        System.out.println(result);
    }
}