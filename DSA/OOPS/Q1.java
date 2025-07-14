package OOPS;

public class Q1{
    public static void main(String[]args){
        // i want to create a person object
        Person.breath(); // Static method call
        System.out.println(Person.country); // Static field access

        // Create the object from class 
        Q1 outer = new Q1();
        Person p1 = outer.new Person();

        System.out.println(p1.age);
        System.out.println(p1.name);
        p1.eat(); // Instance method call
        p1.dance(); // Instance method call

        p1.eat();
        p1.dance();
        
    }

    class Person {
        // State - Fields 
        String name ;
        int age;
        static String country = "India";

        // Behavior - Methods
        void eat(){
            System.out.println("Eating...");
        }
        void dance(){
            System.out.println("Dancing...");
        }
        static void breath(){
            System.out.println("Breathing...");
        }
    }
}