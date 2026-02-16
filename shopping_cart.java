import java.util.Scanner;
public class shopping_cart {
    public static void main(String args) {
        Scanner sc = new Scanner (System.in);

        String item;

        int Quantity;

        double price;


        System.out.print("What item would you like to buy? ");
        item = sc.nextLine();
        System.out.print("What is the price of each ? ");
        price = sc.nextDouble();
         
        System.out.print("How many would you like? ");
        Quantity = sc.nextInt();
         
        double total = Quantity * price;
        total = Quantity * price;


        System.err.println("\n");
        System.out.println("----- Shopping Cart Summary -----");
        System.out.println("You have bought "+Quantity + " "+item+"'s");
        System.out.println("Your Total is: Rs."+total);
        
    }
}
