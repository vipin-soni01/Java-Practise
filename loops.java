import java.util.*;
public class loops {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // While Loops 
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println("HELLO "+name+"! Welcome to my game.");


        String response = "";
        
        while(!response.equals("yes")){
            System.out.print("Do you want to play the game? (yes/no): ");

            response = sc.nextLine();
            
        }

        System.out.println("You have entered the game.");
        System.out.println("Please Enjoy !!!!");


        response = "";

        while(!response.equalsIgnoreCase("Q")){
            System.out.print("Enter a number: ");
            int num =sc.nextInt();

            if(num % 2 == 0){
                System.out.println("The number is even.");
            }
            else{
                System.out.println("The number is odd.");
            }
            sc.nextLine();

            System.out.println("Do you want to continue? (Q to quit): ");
            response = sc.nextLine();
        }

        System.out.println("You have exited the game. Thank you for playing!");



        System.out.print("Enter you age: ");
        int age = sc.nextInt();

        System.out.println("Hello "+name+"! . Your age is: "+age); 
        while(age < 0){
            System.out.println("We can't display your age.");
            System.out.println("Please enter a valid age: ");
            age = sc.nextInt();
 
            if(age > 0){
                System.out.println("Your age is: "+age);
            }
        }


        System.out.println("Thanks !!");

        System.out.println("This is made by Vipin Soni.");


        
    }
}
