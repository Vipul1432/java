import java.util.Scanner;

public class nthtermofGP {
    public static int Nth_term(int a, int r, int N) {
        int n = a * (int) (Math.pow(r, N - 1));
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of r :");
        int r = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(Nth_term(a,r,n));
    }
}
