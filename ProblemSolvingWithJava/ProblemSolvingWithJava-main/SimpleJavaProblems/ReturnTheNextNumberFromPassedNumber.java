// https://edabit.com/challenge/Qir2pQ2Qp3uwrfJNZ
public class ReturnTheNextNumberFromPassedNumber{
    public static int DisplayingNextNumber(int passedNumber){
        // return ++passedNumber;
        return passedNumber + 1;
    }
    public static void main(String[] args) {
        int result = DisplayingNextNumber(20);
        System.out.println(result);
    }
}