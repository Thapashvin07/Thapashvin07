import java.util.Scanner;
public class DivSum {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,temp,sum,n;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            sum=0;
            for(temp=a[i];temp!=0;temp/=10)
                sum+=temp%10;
            if(a[i]%sum==0)
                System.out.print(a[i]+" ");
        }
    }
}
