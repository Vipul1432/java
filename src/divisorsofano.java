//import java.util.Scanner;
//
//public class divisorsofano {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++)
//        {
//            if (n%i == 0)
//                System.out.println(i);
//        }
//    }
//}


//Print all the divisor of a number :-


import java.util.Scanner;

public  class divisorsofano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int i;
        for (i = 1; i*i <= n; i++)
        {
            if (n%i == 0)
                System.out.print(i +",");
        }
        for ( ;i >= 1; i--)
        {
            if (n%i == 0)
                System.out.print(n/i + ",");
        }
    }
}

