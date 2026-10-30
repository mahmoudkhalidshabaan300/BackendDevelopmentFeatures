public class TheFarmProblem{
    public static int totalAnimalLegs(int chickens , int cows , int pigs){
        System.out.println("The Number Of Chickens Is = "+chickens);
        System.out.println("The Number Of Cows Is = "+cows);
        System.out.println("The Number Of Pigs Is = "+pigs);
        int totalLegs = chickens * 2 + cows * 4 + pigs * 4;
        System.out.print("The Total Legs Of Different Animals Is = ");
        return totalLegs;
    }
    public static void main(String[] args){
        int result = totalAnimalLegs(2 , 3 , 5);
        System.out.print(result);
    }
}