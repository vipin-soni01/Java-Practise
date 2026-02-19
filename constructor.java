// public class constructor {
//     public static void main(String[] args){
//         Human human1 = new Human("John" , 25);
//         Human human2 = new Human("Alice" , 30);

//         System.out.println("Name 1 : "+human1.name);
//         System.out.println("Name 2 : "+human2.name);


//         human1.show();
//         human2.stop();

//     }
// }
// class Human{
//     String name;
//     int age;

//     // Constructor - a special method that is called when an object is created. It is used to initialize the attributes of the object.
//     Human(String name , int age){
//         this.name = name;   // this keyword is used to refer to the current object. It is used to differentiate between the instance variables and the parameters of the constructor.
//         this.age = age;
//     }

//     void show(){
//         System.out.println(this.name+", He is all set to go.");
//     }
//     void stop(){
//         System.out.println(this.name+ ", He is stopped.");
//     }
// }

// import java.util.*;
// public class constructor{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         String model;
//         System.out.print("Enter the model of your PC / Laptop: ");
//         model = sc.nextLine();

//         String name;
//         System.out.print("Enter the name of your PC / Laptop: ");
//         name = sc.nextLine();

//         int year;
//         System.out.print("Enter the manufacturing year of your PC / Laptop: ");
//         year = sc.nextInt();

//         int price;
//         System.out.print("Enter the price of your PC / Laptop: ");
//         price = sc.nextInt();



//         Computer com = new Computer(model , name , year , price);

//         com.details();
//         com.buy();
//     }
// }
// class Computer{
//     String name;
//     String model;
//     int year;
//     int price;
//     Scanner sc = new Scanner(System.in);
//     Computer(String name , String model , int year ,int price){
//         this.model = model;
//         this.name = name;
//         this.year = year;
//         this.price = price;
//     }

//     void details(){
//         System.out.println("Your PC / Laptops details are: ");

//         System.out.println("Name : "+this.name);
//         System.out.println("Model : "+this.model);
//         System.out.println("Manufacturing Year: "+this.year);
//         System.out.println("Price :"+this.price);

//     }

//     void buy(){
//         String purchase;
//         System.out.print("Do you want to buy this ?(yes / no) : ");
//         purchase = sc.nextLine();

//         if(purchase.equals("yes")){
//             System.out.println("Thank you , Come Again !!");
//         }
//         else{
//             System.out.println("Visit Again and buy next time !");
//         }
//     }
// }




// Enum
import java.util.*;
enum GameLevel{
    EASY , MEDIUM , HARD
}
public class constructor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Score: ");
        int score = sc.nextInt();
        GameLevel level;

        if(score >0 && score <= 50){
            level = GameLevel.EASY;
        }
        else if(score > 50 &&  score <= 75){
            level = GameLevel.MEDIUM;
        }
        else{
            level = GameLevel.HARD;
        }
        System.out.print(level);
    }
}

