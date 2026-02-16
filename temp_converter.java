import java.util.*;
public class temp_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Welcome :::");

        System.out.println("1: Convert Celsius to Fahrenheit \n2: Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1/2): ");
        int choice = sc.nextInt();  
        if(choice == 1){
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
    
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
            }
            else{
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
    
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.printf("Temperature in Celsius: %.2f\n", celsius);
            }
    }
     
}
