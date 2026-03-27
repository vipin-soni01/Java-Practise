/* Types of Nested Class -- 2

1. Static Nested Class 

2. Non-Static Nested Class-  It also have 3 parts- (1.Inner Class , 2.Local Class , 3.Anoynomus Class)


Local class is also known as Method Inner Class
*/


// Static CLass
/* 
class M{
    static int x = 10;   //instance variable; data member

    static void show(){
        System.out.println(x);
    }

    // static class B{
    //     static void display(){
    //         System.err.println("Inner class Display Method");
    //         System.err.println(x);  // It will throw error 
    //     }
    // }


    class B{
        void display(){
            System.err.println("Inner class Display Method");
            // System.err.println(x);  // It will throw error
        }
    }
}
class Nested_CLass{
    public static void main(String[] args) {
        // M obj = new M();
        // obj.show();
        // M.show();
        // M.B.display();   // When the class and methods are static type

        M outerobj = new M();  // making the obj of non-static class M
        M.B innerobj = outerobj.new B();   // this will make the obj of B class which is necessary for calling the non-static method
        innerobj.display();  // calling the display method which is also non-static
    }
}
*/

// LOCAL CLASS ---------- 
// A local class or A Method inner class is a speacial type of nested class which is written inside method. 
// To access it's content we need to create it's object and then that obj will be created inside that method only.
// The local class can accesss local variables of the method only and only if that varible is final or efficitvely final.4
/* 
class M{
    int x = 10;    // Instance variable of class M
    void show(){

        final int a = 5;   //show method Local variable // efectively-final varibale. So there will be no problem in accessing it's value 
        // If you wil change the value of 'a' throughout the program, it will through an error
        class B{
            void display(){
                System.err.println("Local Class B display method");
                System.err.println(a);
            }
        }
        B obj = new B();
        obj.display();
    }
}
class Nested_CLass{
    public static void main(String[] args) {
        M obj1 = new M();
        obj1.show();
    }
}

*/



// ANOYNOMUS CLASS --------------------------------
// Anoynomus Class - is the innner class which doesnot have any name , and it's object is being created at the time of defination/declaration itself.
// It can not further instantiated . And it doesn't have it's constructor.
// It can use the interface Constructor(Sudo Constructor)

interface A{
    void makeSound();
}
/* 
class C implements A{
    public void makeSound(){         
        System.err.println("Sound");
    }
}
*/

class Nested_CLass{
    public static void main(String[] args) {
        // C obj = new C();
        // obj.makeSound();

        A obj = new A(){               // This ( A obj = new A() ) is a anoynomus class.  And the object is the Anoynomus class not of the A class.
            public void makeSound(){
                System.err.println("Sound");
            }
        };

        obj.makeSound();


    }
}




/* Functional Programming in Java ---- is a way intorduced after modern java that enables you to write modular and easy or understandable codes.
This is being achieved by the combination of FUNCTION INTERFACES +  LAMBDA EXPRESSIONS  (Ananynomus functional way)
Functional Interface is a speacila type od interface which can have only single abstract method(SAM complex). However, it can have multiple default and static methods
It is being represented by  @FunctionalInterface Allocaton.


Lamba Expression uses the concept of functional interface in the backend to achieve it's functionalities.*/

