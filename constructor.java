public class constructor {
    public static void main(String[] args){
        Human human1 = new Human("John" , 25);
        Human human2 = new Human("Alice" , 30);

        System.out.println("Name 1 : "+human1.name);
        System.out.println("Name 2 : "+human2.name);


        human1.show();
        human2.stop();

    }
}
class Human{
    String name;
    int age;

    // Constructor - a special method that is called when an object is created. It is used to initialize the attributes of the object.
    Human(String name , int age){
        this.name = name;   // this keyword is used to refer to the current object. It is used to differentiate between the instance variables and the parameters of the constructor.
        this.age = age;
    }

    void show(){
        System.out.println(this.name+", He is all set to go.");
    }
    void stop(){
        System.out.println(this.name+ ", He is stopped.");
    }
}
