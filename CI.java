import java.util.*;
public class CI {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the princiapl amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time: ");
        int time = sc.nextInt();

        double CI = p * Math.pow((1 + rate/100), time) - p;
        System.out.printf("The Compound Interest is: %.2f\n",CI);
    }
}
