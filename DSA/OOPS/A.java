package OOPS;

public class A {
    public int f1 = 10; // Instance variable
    int f4 = 40; // Default variable
    protected int f2 = 20; // Protected variable
    private int f3 = 30; // Private variable

    public static void main(String[]args){
        A a = new A(); 
        System.out.println(a.f1); // Accessing public variable
        System.out.println(a.f2); // Accessing protected variable
        System.out.println(a.f4); // Accessing default variable
    }
    
}

