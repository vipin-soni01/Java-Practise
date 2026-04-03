/* 

Exception - is the unwanted event that disrupts the flow of the program. And they can be resolved by developer 
It can be of 2 types-   1. Checked(Compile Time)   2. Unchecked(Runtime)

Error - are those system level or the hardware level issues which can not be fixed be developers excplicitly. 
example - OutOfMemoryError  


                        Object
                          |
                        Throwable
                           |
                           |
                        _________
                        |        |   
                        |        |
                    Exception   Error
                        |          
                        |          
                 __________
                 |         |
                 |         |
            Checkted       Unchecked
        (Compile Time)      (Run Time)
    Ex:- ClassNotFound 
          Exception
         IO Exception
         Arithmetic Exception
         
         



throw:  throw is a keyword which is being used to throw custom exceptions(user-defined ones).
throws: it is alse a keyword and it is  used to depict what kind of exception a method can throw. It is mandatory to be written when your method can possibly throw check exceptions and you are not handeling that exception using track edge block inside that method.
Throwable: Superclass of exception and error in java. 


final - is a keyword which is used with the variable to finalize it's value, so it's value can not be changed.

finally - is a block in exception handeling which always executes , wheather the exception occured or not. We most often write those code which does cleanup task and prevent memory leaks.

finalize - Method used for memory allocation. 


------------------------------------------------------------------
SPECIAL NOTE --------- 

In 3 cases this finally block will not execute  :::::::::
1. JVM crash
2. System.exit.(0)     is written
3. Infinite Loop Case
---------------------------------------------------------------------




*/






// import java.util.*;
// public class exception_Handeling{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.err.println("Enter the values: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         try {
//             System.out.println(a/b);
//         } 
//         catch (ArithmeticException e) {    /* We can also write Generic Exception like --  catch(exception e) */
//             System.out.println("You can not let the b value = 0");
//         }

//     }
// }   



/* Rather than user multiple cathch , You should use Multi-Catch 
*/
