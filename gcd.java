import java.util.Scanner;
public class gcd {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int x = sc.nextInt(); //63
        int y = sc.nextInt(); //21
        int gcd = 0;
        for (int i = 1; i <= x && i <= y; i++ ){ 
            if (x%i==0 && y%i==0) 
                gcd = i;
        }
        System.out.print(gcd);
    }
    
}
