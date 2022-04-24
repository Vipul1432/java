// Java program to demonstrate working of
// interface   :-

// A simple interface
interface In1 {
    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface.
class Abstraction implements In1 {
    // Implementing the capabilities of
    // interface.
    public void display() {
        System.out.println("Hello");
    }

    // Driver Code
    public static void main(String[] args) {
        Abstraction t = new Abstraction();
        t.display();
        System.out.println(a);
    }
}
