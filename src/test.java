import java.util.Locale;
import java.util.Scanner;
//import java.util.Scanner;
//
//public class test {
//    public static String showGreeting(String firstName) {
//        String welcomemsg = "Welcome";
//        welcomemsg += firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
//        return welcomemsg;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name : ");
//        String yourName = sc.next();
//        String msg = showGreeting(yourName);
//        System.out.println(msg);
//    }
//
//}



//public class test {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            main(args[i]);
//        }
//    }
//}


//public class test {
//    public static boolean duplicate(int[] array) {
//
//        boolean isDuplicate = false;
//        for (int x = 0; x < array.length-1; x++) {
//            for (int y = x+1; y < array.length; y= y-1)
//                if (array[x] == array[y])
//                    isDuplicate = true;
//                if (isDuplicate)
//                    break;;
//
//        }
//        return isDuplicate;
//    }
//
//    public static void main(String[] args) {
//        int[] arr=new int[3];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        boolean result = duplicate(arr);
//        System.out.println(result);
//    }
//


//public class test {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//        int c = ++a * b--;
//        System.out.println(c);
//        int d = a-- + ++b;
//        System.out.println(d);
//        double pi = Math.PI;
//        System.out.format("pi is %09f%n",pi);
//    }
//}



//public class test {
//    public static String getBirthdate() {
//        System.out.println("Enter your birthdate in format MMDDYYY");
//        Scanner sc = new Scanner(System.in);
//        String birthdate = sc.next();
//        sc.close();
//        return birthdate;
//    }
//}


//public class test {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//    }
//}


//public class test {
////
//public static void main(String[] args) {
//    char ch;
//    switch(ch)
//    {
//        case 'a':
//            System.out.println("Vowel");
//            break;
//        case 'e':
//            System.out.println("Vowel");
//            break;
//        case 'i':
//            System.out.println("Vowel");
//            break;
//        case 'o':
//            System.out.println("Vowel");
//            break;
//        case 'u':
//            System.out.println("Vowel");
//            break;
//        case 'A':
//            System.out.println("Vowel");
//        case 'E':
//            System.out.println("Vowel");
//            break;
//        case 'I':
//            System.out.println("Vowel");
//            break;
//        case 'O':
//            System.out.println("Vowel");
//            break;
//        case 'U':
//            System.out.println("Vowel");
//            break;
//        default:
//            System.out.println("Consonant");
//    }
//}
//}



//public class test {
//    public static void main(String[] args) {
//        try {
//            int x = 1/0;
//            System.out.println("try");
//        }
//        catch (ArithmeticException ex) {
//            System.out.println("Catch Arithmetic Exception");
//        }
//        catch (Exception ex) {
//            System.out.println("Catch Exception");
//        }
//        finally {
//            System.out.println("Finally");
//        }
//    }
//}


//public class test {
//    public static void main(String[] args) {
//        int x = 5;
//        int y = 7;
//        String value1 = "x + y = " + x + y;
//        System.out.println(value1);
//        String value2 = null;
//        value2 += "+ x + y";
//        System.out.println(value2);
//        String value3 = "x + y + " + (x + y);
//        System.out.println(value3);
//        byte value4 = 127;
//        value4++;
//        System.out.println(value4);
//        System.out.println(1.0/3.0);
//        System.out.println(1.0f/3.0f);
//    }
//}

//public class test {
//    public static void main(String[] args) {
//      String s1 = "Hello World";
//      String s2 = "Hello World";
//      String s3 = s2;
//      s1 = "Hi";
//        System.out.println(s3);
//        System.out.println(s1);
//        System.out.println(s2);
//
//    }
//}


//public class test {
//    public static void main(String[] args) {
//        System.out.println(10 + 20 + "Hello");
//        System.out.println("Hello" +10 +20);
//        Scanner sc = new Scanner(System.in);
//    }
//}


public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String s = sc.nextLine();

        System.out.println("You entered this message : " +s);
    }
}




