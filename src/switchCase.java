import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a move :");
        char move = sc.next().charAt(0);
        switch (move)
        {
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
            case 'U':
                y++;
                break;
            case 'D':
                y--;
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
