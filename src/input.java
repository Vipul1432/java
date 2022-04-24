//Input from User in java :-

//1. Bufffered Reader :-


//Read a String from user :-


import java.io.*;
import java.util.Scanner;
//public class input {
//    public static void main(String[] args) throws IOException {
//      BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter a Srring : ");
//        String s = br.readLine();
//        System.out.println("You Entered : " + s);
//    }
//}



//Read a Integer from user :-

//public class input {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter a Integer : ");
//        int a = Integer.parseInt(br.readLine());
//        System.out.println("You Enter : " + a);
//    }
//}


//Scanner Class for Input from User :-


public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.nextLine();
        System.out.println("You Enter String " + s);
        System.out.println("Enter a Integer : ");
        int a = sc.nextInt();
        System.out.println("Ypu Entered Integer " + a);
        System.out.println("Enter a Float : ");
        float b = sc.nextFloat();
        System.out.println("Ypu Enter Float " + b);
    }
}