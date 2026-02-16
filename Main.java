public class Main{
    public static void main(String[] args){
        // System.out.println("I like Java");
        // System.out.print("It's really working \n");
        // System.out.print("Hello world");

        // Scanner sc = new Scanner (System.in);

        String name = "Arunachal Pradesh";
        

        // int length= name.length();
        // System.out.println("Your name length is: "+length);

        // name = name.toUpperCase();
        // System.out.println("Your name in uppercase is: "+name);

        // name = name.toLowerCase();
        // System.out.println("Your name in Lower cases: "+name);

        // int index = name.indexOf('A');
        // System.out.println("The index of 'A' is: "+index);

        
        // Sub string(start , end) -> it will return the string from start index to end index-1

        String s = name.substring(0,10 );
        System.out.println("The substring is: "+s);
        String s1 = name.substring(10);
        System.out.print("The second substring is: "+s1);
    }
}