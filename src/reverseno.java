import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverse = reverse*10 + lastdigit;
            n = n/10;
        }
        System.out.println("The reverse number is " +reverse);
    }
}
