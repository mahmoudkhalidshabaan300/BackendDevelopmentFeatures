// https://edabit.com/challenge/ccv2_f6b7938b958a87bec0c99721 
public class WillTheNextFileFit{
    public static boolean checkNextFileFits(int fileCapacity , int fileUsed , int fileSize){
        System.out.println("The File Capacity Is = "+fileCapacity);
        System.out.println("The File Used Is = "+fileUsed);
        System.out.println("The File Size Is = "+fileSize);
        int sumOfUsedAndSize = fileUsed + fileSize;
        System.out.println("The Sum Of File Used , And File Size Is = "+sumOfUsedAndSize);
        if(fileCapacity >= sumOfUsedAndSize){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean checkFits = checkNextFileFits(100 , 70 , 20);
        System.out.print("The Next File Fitting Is : ");
        System.out.print(checkFits);
    }
}