import java.util.Scanner;

class Addition {

    // Initially taking sum as 0
    // as we have not started com[utation
    int sum = 0;

    // Method
    // To add two numbers
    public int addTwoInt()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        // Adding two integer value
        sum = a + b;

        // Returning summation of two values
        return sum;
    }
}

// Class 2
// Helper class
public class method {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1 inside main() method
        Addition add = new Addition();

        // Calling method of above class
        // to add two integer
        // using instance created
        int s = add.addTwoInt();

        // Printing the sum of two numbers
        System.out.println("Sum of two integer values :"
                + s);
    }
}