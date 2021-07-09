import java.util.Scanner;

public class h3e2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = sc.nextInt();

      while (x!=1) {
            x = x!=0 ? x>>1 : 3*x + 1;
            System.out.println(x);
 }


    }
}
