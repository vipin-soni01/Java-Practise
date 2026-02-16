import java.util.Scanner;
public class Conditions {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        // int age = 0;
        // String name;
        // boolean isStudent = false;

        // System.out.print("Enter your age: ");
        // age = sc.nextInt();

        // sc.nextLine();
        // System.out.print("Enter your name: ");
        // name = sc.nextLine();

        // System.out.print("Are you a student ? (true/false): ");
        // isStudent = sc.nextBoolean();


        // /* This will check if you have entered your name or not !! */
        // if(name.isEmpty()){
        //     System.out.println("You haven't entered your name. 🤦‍♂️");
        // }
        // else{
        //     System.out.println("Hello 🫡, "+name+"!");
        // }


        // // This will check if you are eligible to vote or not !!
        // if(age >= 18){
        //     System.out.println("You are eligible to vote.");
        // }
        // else if(age < 0){
        //     System.out.println("Invalid age entered.");
        // }
        // else{
        //     System.out.println("No , you are not eligible.");
        // }


        // This si check if you are a student or not!!
        
        // if(isStudent){
        //     System.out.println("You are a student.");
        // }
        // else{
        //     System.out.println("You are not a student.");
        // }



        // Nested if-else statement
        // boolean isStudent = true;
        // boolean isSenior = true;
        // double price = 100.0;

        // System.out.print("Are you a student? (true/false): ");
        // isStudent=  sc.nextBoolean();

        // System.out.print("Are you a senior? (true/false): ");
        // isSenior = sc.nextBoolean();

        // if(isStudent){
        //     if(isSenior){
        //         price = price * 0.5;  // 50% discount
        //         System.out.println("You are senior and a student: "+price);
        //     }
        //     else{
        //         price = price * 0.8; // 20% discount
        //         System.out.println("You are only a student: "+price);
        //     }
        // }
        // else{
        //     if(isSenior){
        //         price = price * 0.7; // 30% discount
        //         System.out.println("You are a only a senior: "+price);
        //     }
        //     else{
        //         System.out.println("You are neither a student nor a senior: "+price);
        //     }
        // }
        








        //-----------------------------------------------------------  Switch Case 

        System.out.print("Enter the day no. : ");
        int n = sc.nextInt();
        switch(n){
            case 1 -> System.out.print("Monday");
            
            case 2 -> System.out.print("Tuesday");

            case 3 -> System.out.print("Wednesday");

            case 4 -> System.out.print("Thursday");

            case 5 -> System.out.print("Friday");

            case 6 -> System.out.print("Saturday");

            case 7 -> System.out.print("Sunday");

            default -> System.out.print("Invalid day number");
        }
        sc.close();
    }
}
