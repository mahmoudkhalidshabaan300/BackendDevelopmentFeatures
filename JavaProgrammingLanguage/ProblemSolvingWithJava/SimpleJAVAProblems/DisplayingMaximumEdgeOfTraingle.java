// https://edabit.com/challenge/zBhuXyFeSQdizC5LW
public class DisplayingMaximumEdgeOfTraingle{
    public static int returnMaximumEdgeOfTraingle(int fristSide , int secondSide){
        System.out.println("The Frist Side Is : "+fristSide);
        System.out.println("The Second Side Is : "+secondSide);
        int maximumTraingleEdge = fristSide + secondSide - 1;
        return maximumTraingleEdge;
    }
    public static void main(String[] args){
        int result = returnMaximumEdgeOfTraingle(10 , 12);
        System.out.print("The Maximum Edge Of The Traingle Is = ");
        System.out.println(result);
    }
}