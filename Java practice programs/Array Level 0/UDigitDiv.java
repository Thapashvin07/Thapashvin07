import java.util.Scanner;
public class UDigitDiv {
    public static void main(String args[])
    {
        int i,n,u_digit;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            u_digit=a[i]%10;
            if(u_digit==0)
                System.out.println((float)a[i]/10);
            else    
                System.out.println((float)a[i]/u_digit);
        }
    }
}
