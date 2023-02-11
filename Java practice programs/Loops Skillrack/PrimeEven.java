import java.util.Scanner;
public class PrimeEven {
    public static void main(String[] arg)
    {
        int i,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        i=2;
        do{
            if(n%i==0)
                break;
            i++;
        }while(i<=n/2);
        if(i==n/2+1||n%2==0)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
