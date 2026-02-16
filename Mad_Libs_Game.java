import java.util.Scanner;

public class Mad_Libs_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2 ;
         String noun1, verb , adjective3;
        
        // Taking inputs from the user

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (Person or Animal): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter Adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter the verb ( end with -ing): ");
         verb = scanner.nextLine();
        System.out.print("Enter another adjective (description): ");
        adjective3 = scanner.nextLine();

        

        // Displaying the story -----
        scanner.nextLine(); 
        System.out.println("Today, I went to a " + adjective1);
        System.out.println("Ther I saw "+ noun1);
        System.out.println(noun1 + " was very " + adjective2);
        System.out.println("So, I started " + verb + " with " + noun1);
        System.out.println("It was a " + adjective3 + " day!");

        System.out.println("Thank you for playing the Mad Libs Game! ❤️, Hope you enjoyed it. 😊");
        System.out.println("Made by Vipin Soni💖");
        scanner.close();
    }
}
