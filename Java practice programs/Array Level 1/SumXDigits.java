import java.util.Scanner;
public class SumXDigits {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,x,sum=0,temp,count=0;
        n=s.nextInt();
        x=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            count=0;
            for(temp=a[i];temp!=0;temp/=10)
                count++;
            if(count==x)
                sum+=a[i];
        }
        System.out.println(sum);
    }
}
