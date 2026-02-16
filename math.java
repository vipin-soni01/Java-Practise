// import java.util.*;
// public class math {
//     public static void main(String[] args) {
        
//         Scanner sc= new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("The value of a is: "+a);
//         System.out.println("The value of b is: "+b);
//         int hypo = (int) Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));

//         System.out.println("The hyptenous s: "+hypo);
//     }
// }





import java.util.*;
public class math{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double r;
        System.out.print("Enter the radius: ");
        r= sc.nextDouble();

        double area = Math.PI * Math.pow(r,2);
        System.out.printf("The Area of this circle is: %.2f units square.\n",area);

        double Circumference = 2 * Math.PI * r;
        System.out.println("The Circumference of this circle is: "+Circumference+" units.");

        double Volume = ( 4/3) * Math.PI * Math.pow(r,3);
        System.out.println("The Volume of this sphere is: "+Volume+" units cube.");
    }
}