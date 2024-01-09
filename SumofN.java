import java.util.Scanner;

public class SumofN {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++)
            sum += i;
        System.out.print("The sum of " + n + " numbers is " + sum);
    }
}