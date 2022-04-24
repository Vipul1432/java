import java.util.Scanner;

public class lastDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int a = Math.abs(n);
        int ans = a % 10;
        System.out.println("The last digit of your number is : " + ans);
    }
}
