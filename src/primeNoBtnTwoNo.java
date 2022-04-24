import java.util.Scanner;
import java.lang.*;


public class primeNoBtnTwoNo {
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num%i == 0)
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("The prime number between " +a+ " and " +b+ " are ");
        for(int i=a; i <=b; i++)
            if(isPrime(i)) {
                System.out.print(i +" ");
            }
    }
}
