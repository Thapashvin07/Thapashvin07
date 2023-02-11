import java.util.Scanner;
public class FormInt
{
    public static void main(String arg[])
    {
        int i,x,temp,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        x=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(temp=x;temp!=0;temp/=10)
            {
                if(temp%10==a[i])
                    break;
            }
            if(temp==0)
                break;
        }
        if(i==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}