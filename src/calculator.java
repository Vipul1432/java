//Calculator Using if else :-

//import java.util.Scanner;
//
//public class calculator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number :");
//        int fnum = sc.nextInt();
//        System.out.println("Enter second number :");
//        int snum = sc.nextInt();
//        System.out.println("Enter +, -, *, /");
//        char sign;
//        int ans;
//            sign=sc.next().charAt(0); //Receive input from user
//            if (sign == '+' )/*making use of if statement to determine the addition sign*/{
//                ans =fnum + snum;
//                System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
//            }
//            else if(sign == '-')/* else if statement for minus sign*/
//            {
//                ans=fnum-snum;
//                System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
//            }
//            else if(sign == '/'){
//                ans=fnum/snum;
//                System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
//            }
//            else if(sign == '*'){
//                ans=fnum*snum;
//                System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
//            }
//            else
//
//                System.out.println("Your Input is not correct,please check it for any error(s).");
//    }
//}

//Calculator Using switch case :-

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}