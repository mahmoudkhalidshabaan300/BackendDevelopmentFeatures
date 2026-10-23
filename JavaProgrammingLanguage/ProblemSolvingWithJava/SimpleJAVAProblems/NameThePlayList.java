// https://edabit.com/challenge/ccv2_cd68bfdcfa174dbeb6e3cd5a
public class NameThePlayList{
    public static String returnThePlayListName(String mood){
        System.out.println("The Play List Name Is : ");
        return mood + " " + "Mix";
    }
    public static void main(String[] args){
        String PlayListName = returnThePlayListName("Rainy Day");
        System.out.print(PlayListName);
    }
}