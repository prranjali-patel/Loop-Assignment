import java.util.Scanner;

public class multable {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which number's table do you want: ");
        int n = sc.nextInt();
        for (int i = 1; i <=10; i++){
            int tab = n*i;
            System.out.println(n + " x " + i + " = " + tab);
        }
    }
}