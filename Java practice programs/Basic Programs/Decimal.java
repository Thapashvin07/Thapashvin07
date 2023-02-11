import java.util.Scanner;

public class Decimal {
    public static void main(String arg[])
    {
        Scanner s =new Scanner(System.in);
        int i,n,temp,sum=0;
        n=s.nextInt();
        for(temp=n,i=0;temp!=0;temp/=10,i++)

            sum=sum+((temp%10)*(int)Math.pow(2,i));
        System.out.println(sum);
    }
    
}
