import java.util.Scanner;

public class ncr_npr {
    static int fact(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();

        // nPr = n!/(n-r)!
        // nCr = n!/((n – r)!r!)

        int ans = fact(n) / (fact(r) * fact(n-r));
        System.out.println(n + "C" +r+ " = " +ans);
    }
}
