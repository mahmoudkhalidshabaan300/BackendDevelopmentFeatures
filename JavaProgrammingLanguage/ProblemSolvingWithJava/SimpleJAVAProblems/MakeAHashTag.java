// https://edabit.com/challenge/ccv2_de9a82a092eadb1a5b178df4
public class MakeAHashTag{
    public static String MakeAHashTagWord(String word){
        System.out.println("The Original Word Is : ");
        System.out.print(word);
        return "#" + word;
    }
    public static void main(String[] args){
        String HashTagWord = MakeAHashTagWord("coding.");
        System.out.println("\nThe Hash Tag Word Is : ");
        System.out.print(HashTagWord);
    }
}