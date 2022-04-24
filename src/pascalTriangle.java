//Pascal Triangle :-

// 1                0C0
// 1 1              1C0 1C1
// 1 2 1            2C0 2C1 2C2
// 1 3 3 1          3C0 3C1 3C2 3C3
// 1 4 6 4 1        4C0 4C1 4C2 4C3 4C4


import java.util.Scanner;

public class pascalTriangle {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(fact(i) / (fact(j) * fact(i - j)) + " ");
            }
            System.out.println();
        }
    }
}
