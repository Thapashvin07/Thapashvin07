import java.util.Scanner;
public class MaxSumDigit {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,sum,temp,m_sum=0,val=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            sum=0;
            for(temp=a[i];temp!=0;temp/=10)
                sum+=a[i];
            if(sum>m_sum)
            {
                m_sum=sum;
                val=a[i];
            }
            else if(sum==m_sum)
                val=(a[i]>val)?a[i]:val;
        }
        System.out.println(val);
    }
}
