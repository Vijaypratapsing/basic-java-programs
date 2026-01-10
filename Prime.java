import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.print("Enter Number:\t");
        n=sc.nextInt();
        if(n<2)
        System.out.println(n+" is not a prime number");
        else if(n==2)
        System.out.println("2 is a prime number");
        else
        {
            for(i=2;i<=n;i++)
            {
                if(n%i==0)
                break;
            }
            if(i==n)
            System.out.println( n+" is a prime number");
            else
            System.out.println(n+" is not a prime number");
        }
    }
}
