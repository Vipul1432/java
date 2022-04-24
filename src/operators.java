//Operators in java ;-

//Arithmatic Operator :-


//public class operators {
//    public static void main(String[] args) {
//        int a = 10, b = 20;
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        int c = (a+b*10);
//        System.out.println(c);
//        c = a++; // c = a;  , c = c + 1;
//        System.out.println(c + " " + a);
//        c = ++a;  // a = a + 1; , c = 1;
//        System.out.println(c + " " + a);
//    }
//}


//Assignment Operators :-
// --> =, +=, -=, *=, %=


//public class operators {
//    public static void main(String[] args) {
//        int a = 10, b = 5, c;
//        a += b; // a = a + b;
//        System.out.println(a);
//        a %= b;
//        System.out.println(a);
////        (c =(a = b));
//        System.out.println(c);
//    }
//}


//Logical Operators :-
// --> &&(And Operation i.e if both condition are true than execute),
// --> ||( Or Operator i.e  either one condition is satisfying it will execute),
// --> !(It convert true to false and false to true)


//import java.util.Scanner;
//
//public  class operators {
//    public static void main(String[] args) {
//        String user = "vipul", pwd = "Vipul";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter User Id : ");
//        String iu = sc.next();
//        System.out.println("Enter User Password :");
//        String ip = sc.next();
//        if (user.equals(iu) && pwd.equals(ip))
//            System.out.println("Welcome");
//         else
//        System.out.println("Try Again");
//    }
//}


//Realational Operators ;-


//public class operators {
//    public static void main(String[] args) {
//      int a = 10, b = 20;
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a<b);
//        System.out.println(a>b);
//        System.out.println(a>=b);
//        System.out.println(a<=b);
//    }
//}


//Bitwise Operators :-
// --> &(AND), |(OR), ^(X-OR), ~(complement), <<(left shift)), >>(right shift)


public class operators {
    public static void main(String[] args) {
        int a = 3, b =6;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

//        left shift :-

        System.out.println(a<<1);
        int c = a<<b; // (c = a * 2^b)
        System.out.println(c);
        int d = -1;
        System.out.println(d<<1);

//        right shift(for positive fills with 0 and for negative fills with 1) :-
//        For Positive Number :-

        int e = 33;
        System.out.println(e>>1);

//        For Negative Number :-

        int x = -2;
        System.out.println(x>>1);

//        Unsigned Right shift operator :-

        int y = 2;
        System.out.println(y>>>1);

//        For negative number it gets positive Number :-

        System.out.println(x>>>1);
    }
}