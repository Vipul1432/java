import java.util.Scanner;

public class nthtermofAP {
    public static int Nth_term(int a, int d, int n)
    {
        int ans = a + (n - 1) * d;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the va;ue of d :");
        int d = sc.nextInt();
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println(Nth_term(a,d,n));
    }
}
