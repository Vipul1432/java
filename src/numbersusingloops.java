

//Factorial Program using loop itretive in java :-


import java.util.Scanner;

public class numbersusingloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= n; i++)
        {
         ans *= i;
        }
        System.out.println(ans);
    }
}


//    Factorial Program using while loop in java :-


//import java.util.Scanner;
//
//public class numbersusingloops {
//public static void main(String[] args) {
//
//        int i = 1;
//        int factorial = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        int num = sc.nextInt();
//        while(i <= num)
//        {
//        factorial *= i;
//        i++;
//        }
//        System.out.printf("Factorial of %d = %d", num, factorial);
//    }
//}


//    Factorial Program using recursion in java :-

//import java.util.Scanner;
//
//public class numbersusingloops {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :");
//        int n = sc.nextInt();
//        int fact = multiplyNumber(n);
//        System.out.println("Factorial of " +n+ " is " +fact);
//    }
//    public static int multiplyNumber(int n)
//    {
//        if (n >= 1)
//            return n * multiplyNumber(n -1);
//        else
//            return 1;
//    }
//}