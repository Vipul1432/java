//Counting of a number :-


//import java.util.Scanner;
//
//public class problemsofloop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        int n = sc.nextInt();
//        int count = 0;
//        while (n > 0) {
//            n = n / 10;
//            count = count + 1;
//        }
//        System.out.println(count);
//    }
//}



//Table of a given number :-


//import java.util.Scanner;
//
//public class problemsofloop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :");
//        int n = sc.nextInt();
//        System.out.println("The table of " + n + " is :");
//        int i = 1;
//        while (i < 11)
//        {
//            System.out.println(n + " * " + i +" = " + (i * n));
//            i++;
//        }
//    }
//}


//printing a table of a given number using for loop ;-


//import java.util.Scanner;
//
//public  class problemsofloop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :");
//        int n = sc.nextInt();
//        System.out.println("The table of " +n+ " is : ");
//        for (int i = 1; i <=10; i++)
//        {
//            System.out.println(n + " * " + i + " = " + (i*n));
//        }
//    }
//}



//Pattern using loops using while loop :-

//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *


//import java.util.Scanner;
//
//public class problemsofloop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :");
//        int n = sc.nextInt();
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n)
//            {
//                System.out.print(" * ");
//                j++;
//            }
//            System.out.println(" ");
//            i++;
//        }
//    }
//}



//Pattern using loops using for loop :-

//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *
//        *  *  *  *  *


//import java.util.Scanner;
//
//public class problemsofloop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++)
//            {
//                System.out.print(" * ");
//            }
//            System.out.println(" ");
//        }
//    }
//}

//Pattern using loops using for loop :-

//       *
//       * *
//       * * *
//       * * * *
//       * * * * *


//        *
//        *  *
//        *  *  *
//        *  *  *  *
//        *  *  *  *  *



//import java.util.Scanner;
//
//public class problemsofloop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number :");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print(" * ");  //(" * ")
//            }
//            System.out.println(" ");
//        }
//    }
//}



//Pattern using loops using for loop :-


//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

import java.util.Scanner;

public class problemsofloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = n-i; j > 0; j--)
            System.out.print(" ");
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");  //(" * ")
            }
            System.out.println(" ");
        }
    }
}