import java.util.Scanner;
public class SumUDX {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,x,sum=0;
        n=s.nextInt();
        x=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]%10==x)
                sum+=a[i];
        }
    System.out.println(sum);
    }
}
