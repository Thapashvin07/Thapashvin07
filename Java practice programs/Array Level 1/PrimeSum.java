import java.util.Scanner;
public class PrimeSum {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,k=0,n;
        n=s.nextInt();
        int[]a=new int[n/2];
        for(i=1;i<=n;i++)
        {
            if(i==2||i%2!=0)
            {
                for(j=2;j<=i/2;j++)
                {
                    if(i%j==0)
                        break;
                }
                if(j==(i/2)+1)
                {
                    a[k]=i;
                    k++;
                }
            }
        }
        label:for(i=0;i<k-1;i++)
        {
            for(j=0;j<k;j++)
            {
                if(a[i]+a[j]==n)
                {
                    System.out.println(a[i]+","+a[j]);
                    break label;
                }
            }
        }
        if(i==k-1)
            System.out.println("-1");
    }
}
