//Generate a java program, 
public class ProjectOne {
    
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum = addToSum(sum, numbers[i]);
            System.out.println("Iteration " + i + ": sum = " + sum);
        }
        
        System.out.println("Final sum: " + sum);
    }
    
    public static int addToSum(int currentSum, int value) {
        currentSum = currentSum + value;
        return currentSum;
    }
}
