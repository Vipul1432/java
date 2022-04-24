//import java.util.Scanner;
//
//public class fibonacci_numbers {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int n = sc.nextInt();
//        if (n == 0)
//        {
//            System.out.print(1);
//        }
//        else if (n == 1)
//        {
//            System.out.print(1 + " ");
//            System.out.print(1);
//        }
//        else {
//            System.out.print(1 + " ");
//            System.out.print(1 + " ");
//            int a = 1;
//            int b = 1;
//            for (int i = 2; i <= n; i++)
//            {
//                int c = a + b;
//                System.out.print(c + " ");
//                a = b;
//                b = c;
//            }
//        }
//
//    }
//}


//Print the sum of fibonacci number:-

//import java.util.Scanner;
//
//public class fibonacci_numbers {
//    static int fib(int n)
//    {
//        if (n <= 1)
//            return n;
//        return fib(n-1) + fib(n-2);
//    }
//    public static void main (String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int n = sc.nextInt();
//        System.out.println(fib(n));
//    }
//}

//Find fibonacci series using method :-


import java.util.Scanner;

public class fibonacci_numbers {
    static void fib(int n) {
        int num1 = 0;
        int num2 = 1;
        int nextNum;
        System.out.println("The fibonacci series are : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
            nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        fib(n); // Method call
    }
}