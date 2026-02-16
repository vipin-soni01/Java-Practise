import java.util.*;
public class weight_conversion {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Weight converter Program: 🫡");

        System.out.println("1:  Convert kgs to pounds \n2: Convert pounds to kgs");

        System.out.print("Enter your choice (1/2): ");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in kgs: ");
            double kgs = sc.nextDouble();
            
            double pound = kgs * 2.20462;
            System.out.printf("Your weight in pounds: %.2f\n",pound);
        }
        else{
            System.out.print("Enter your weight in pounds: ");
            double po = sc.nextDouble();

            double con = po / 2.20462;
            System.out.printf("Your weight in kgs: %.2f\n",con);
        }
    }
}
