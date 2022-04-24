import java.util.Scanner;


//Find a number is even or odd :-


//public class if_else {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :");
//        int a = sc.nextInt();
//        if (a%2 == 0)
//            System.out.println("The number you entered is even");
//        else
//            System.out.println("The number you entered id odd");
//    }
//}


//Sum of n Natural Numbers :-


//public class if_else {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        int a = sc.nextInt();
//        if (a < 0)
//        {
//            System.out.println("Invalid Input");
//            return;
//        }
//        System.out.println(a * (a + 1)/2);
//    }
//}



// Nested if else ladder :-

// Find a number is positive even or positive odd or negative even or negative odd :-


//public  class if_else {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number :");
//        int a = sc.nextInt();
//        if (a > 0) {
//            System.out.println("The number you entered is positive");
//            if (a % 2 == 0)
//                System.out.println("The number is even.");
//            else
//                System.out.println("The number is odd.");
//        }
//        else if (a < 0) {
//                System.out.println("The number you entered is negative");
//                if (a % 2 == 0)
//                    System.out.println(" The number is even.");
//                else
//                    System.out.println("The number is odd.");
//            }
//        else {
//                System.out.println("The number you entered is zero");
//            }
//        }
//    }



//Find the Largest number between three numbers :-

//1st Method :

//public class if_else {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number :");
//        int a = sc.nextInt();
//        System.out.println("Enter Second Number :");
//        int b = sc.nextInt();
//        System.out.println("Enter the third number :");
//        int c = sc.nextInt();
//        if (a >= b && a >= c) {
//            System.out.println("The biggest number is :" +a);
//        }
//        else if (b >= a && b >= c) {
//            System.out.println("The biggest number is :" +b);
//        }
//        else {
//            System.out.println("The biggest number is : " +c);
//        }
//    }
//}


//Second Method :-

//public class if_else {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number :");
//        int a = sc.nextInt();
//        System.out.println("Enter the second number :");
//        int b = sc.nextInt();
//        System.out.println("Enter the third number :");
//        int c = sc.nextInt();
//        int ans_1 = Math.max(a, b);
//        int ans = Math.max(ans_1, c);
//        System.out.println("The maximum number is :" +ans);
//    }
//}


//Finding a yer is Leap year or not :-


//public class if_else {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a year :");
//        int year = sc.nextInt();
//        if (year % 4 == 0 && year % 100 != 0)
//        {
//            System.out.println("Leap Year");
//        }
//        else if (year % 400 == 0)
//        {
//            System.out.println("Leap Year");
//        }
//        else
//            System.out.println("Not Leap Year");
//    }
//}