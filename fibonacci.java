import java.util.Scanner;
public class fibonacci {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int num1 = 1;
        int num2 = 1;
        int temp = 0;
        System.out.print(num1+"\t");
        System.out.print(num2+"\t");
        for (int i = 0; i < n-2; i++)
        {
            temp = num1;
            num1 = num2;
            num2 = temp + num2;
            System.out.print(num2+"\t");
        }
    }
}