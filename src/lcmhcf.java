//HCF or GCD of two no :-


//import java.util.Scanner;
//
//public class lcmhcf {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number :");
//        int a = sc.nextInt();
//        System.out.print("Enter second number :");
//        int b = sc.nextInt();
//        int ans = 1;
//        int x = Math.min(a, b);
//        for (int i = 1; i <= x; i++) {
//            if (a%i ==0 && b%i ==0)
//            {
//                ans = i;
//            }
//        }
//        System.out.println("The HCF or GCD of "+a+ " and " +b+ " is " +ans);
//    }
//}


//LCM of two no :-


import java.util.Scanner;

public class lcmhcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter second number :");
        int b = sc.nextInt();
        int x = Math.max(a, b);
        int y = a * b;
        int ans = x;
        for (int i = x; i <= y; i++) {
            if (i%a == 0 && i%b == 0)
            {
                ans = i;
                break;
            }
        }
        System.out.println("The LCM of "+a+ " and " +b+ " is " +ans);
    }
}
