// https://edabit.com/challenge/ccv2_de9a82a092eadb1a5b178df4
public class MakeAHashTag{
    public static String hashtagWithString(String word){
        return "#" + word;
    }
    public static void main(String[] args) {
        String result = hashtagWithString("PixelArt");
        System.out.println(result);
    }}