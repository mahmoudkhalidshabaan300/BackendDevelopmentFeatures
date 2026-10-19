// https://edabit.com/challenge/ccv2_f6b7938b958a87bec0c99721
public class WillTheNextFileFit{
    public static boolean fileFits(int capacity , int size , int used){
        int sumOfSizeAndUsed = size + used;
        if(sumOfSizeAndUsed <= capacity){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result = fileFits(100 , 70 , 31);
        System.out.println(result);
    }
}
