import java.util.Scanner;
public class MaxSumUdigit {
    public static void main(String arg[]){
    int i,j,sum,n,m_sum=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int[]a=new int[n];
    for(i=0;i<n;i++)
        a[i]=s.nextInt();
    for(i=0;i<n/2;i++)
    {
        sum=a[i];
        for(j=i+1;j<n;j++)
        {
            if(a[i]%10==a[j]%10)
                sum+=a[j];
        }
        if(sum>m_sum)
            m_sum=sum;
    }
    System.out.println(m_sum);
}
}