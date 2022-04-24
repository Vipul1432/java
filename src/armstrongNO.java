import java.util.Scanner;

import static java.lang.Math.pow;

public class armstrongNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        int origonaln = n;
        while (n > 0) {
            int lastdigit = n % 10;
            sum += pow(lastdigit, 3);
            n = n /10;
        }
        if (sum == origonaln) {
            System.out.println("Armstrong number");
        }
        else
            System.out.println("Not Armstrong number");
    }
}
