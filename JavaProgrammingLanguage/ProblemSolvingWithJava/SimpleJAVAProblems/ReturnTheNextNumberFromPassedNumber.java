// https://edabit.com/challenge/Qir2pQ2Qp3uwrfJNZ
public class ReturnTheNextNumberFromPassedNumber{
    public static int incrementTheNumberByOne(int number){
        System.out.printlnI("The Number Is = "+number);
        int nextNumber = number + 1;
        return nextNumber;
    }
    public static void main(String[] args){
        int incrementedNumber = incrementTheNumberByOne(9);
        System.out.println("The Incremented Number By One Is = "+incrementedNumber);
    }
}