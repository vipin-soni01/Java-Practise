// import java.util.Scanner;   /* Here We have made a Scanner class */
// public class input {
//     public static void main(String[] args) {

//         /* Now make a object of Scanner class , like I made a object name -> scanner */
//         Scanner  scanner  = new Scanner(System.in);
         
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();  /*Here we are taking input with spaces , but if we donot want to take input with spaces so we can just so like ( scanner.next();) */
        
//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt(); /* Here we are taking INT input using nextINT */

//         System.out.print("What is  your gpa: ");
//         double gpa = scanner.nextDouble(); /* Here we are taking double input */

//         System.out.print("Are you a student ? ( true / false ) :");
//         boolean isStudent = scanner.nextBoolean(); /* Here we are taking boolean input */


//         System.out.println("Hello, " + name);
//         System.out.println("Your are " + age +" years old.");
//         System.out.println("Your gpa is: "+gpa);
//         // System.out.println("Student: " + isStudent);

//         if(isStudent){
//             System.out.println("You are enrolled as a student");
//         }
//         else{
//             System.out.println("You are not a student");
//         }
//         scanner.close();
//     }
// }





/* Calculate the Area of a Rectangle */
import java.util.Scanner;
public class input{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter he length: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth: ");
        int breadth = scanner.nextInt();

        int area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
            
        scanner.close();
    }
}