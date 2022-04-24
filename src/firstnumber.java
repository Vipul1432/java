import java.util.Scanner;

public class firstnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(printfirst(n));
    }
    public static int printfirst(int n) {
        while (n > 10)
        {
            n = n / 10;
        }
        return n;
    }
}

