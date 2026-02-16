import java.util.Random;
public class Random_number {
    public static void main(String[] args) {
        
        Random random = new Random();

        int N = random.nextInt(1, 7); // This will generate a random number between 1 and 6 (inclusive)
        System.out.print("The random number generated is: "+N);
        
    }
}