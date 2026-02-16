
// Arithmatic Operator

// public class operator {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;

//         // Addition
//         int sum = a + b;
//         System.out.println("Addition: " + sum);

//         // Subtraction
//         int difference = a - b;
//         System.out.println("Subtraction: " + difference);

//         // Multiplication
//         int product = a * b;
//         System.out.println("Multiplication: " + product);

//         // Division
//         int quotient = a / b;
//         System.out.println("Division: " + quotient);

//         // Modulus
//         int remainder = a % b;
//         System.out.println("Modulus: " + remainder);
//     }
// }



// Augumented Assignment Operator
    // int x = 10;
    // int y = 2;
    // x += y; // x = x + y , output ` 12              
    // x -= y; // x = x - y , output ` 8
    // x *= y; // x = x * y , output ` 20
    // x /= y; // x = x / y , output ` 5
    // x %= y; // x = x % y , output ` 0



// Increment and Decrement Operator
    // int num = 5;
    // num++; // Increment by 1 , output ` 6
    // num--; // Decrement by 1 , output ` 4



// Ternary Operator -> '?'
// import java.util.*;
// public class operator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // int val = 70;
//         // String passOrfail = (val > 40) ? "PASS" : "FAIL";
//         // System.out.print(passOrfail);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         String evenOrodd = ( n % 2 == 0) ? "EVEN" : "ODD";
//         System.out.print("The number is: "+evenOrodd);

//     }
// }





// Logical Operator - > && , || , !
import java.util.*;
public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print("Enter your Name: ");
        name = sc.nextLine();

        if(name.contains(" ") || name.contains("_")){
            System.out.print("Your name is invalid: It should not contain space or underscore");
        }
        else if(name.length() < 4 || name.length() > 20){
            System.out.print("Your name is invalid , it should be between 4 and 20 characters");
        }
        else{
            System.out.print("Your name is Valid. Your name is: "+name);
        }


    }     
}