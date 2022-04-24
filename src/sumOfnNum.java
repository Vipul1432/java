import java.util.Scanner;

public class sumOfnNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
