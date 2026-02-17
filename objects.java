public class objects {
    public static void main(String[] args){
        // Object - an instance of the class which have attributes and methods. 

        Car mycar1 = new Car();
        Car mycar2 = new Car();

        System.out.println(mycar1.make);
        System.out.println(mycar1.model);
        System.out.println(mycar1.year);
        System.out.println(mycar1.price);

        mycar1.drive();

        
        System.out.println();
        System.out.println();

        System.out.println(mycar2.make);
        System.out.println(mycar2.model);
        System.out.println(mycar2.year);
        System.out.println(mycar2.price);

        mycar2.drive();


    }
    
}
class Car{

    String make = "Toyota";
    String model = "Hilux";
    int year = 2024;
    double price = 2400000.00;

    void drive(){
        System.out.print("The car is running.");
    }
    void stop(){
        System.out.print("The car is stopped.");
    }
}
