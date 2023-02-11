import java.util.Scanner;
public class Occur {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int temp,n,m_count=0,count,i,j,k,val=0;
        n=s.nextInt();
        int[]a=new int[30];
        for(temp=n,i=0;temp!=0;temp/=10,i++)
            a[i]=temp%10;
        for(j=i-1;j>=0;j--)
        {
            count=0;
            for(k=j-1;k>=0;k--)
            {
                if(a[j]==a[k])
                    count++;
            }
            if(count>m_count)
            {    
                m_count=count;
                val=a[j];
            }
            else if(m_count==count)
                val=(a[j]>val)?a[j]:val;
        }
        System.out.println(val);
    }
}
