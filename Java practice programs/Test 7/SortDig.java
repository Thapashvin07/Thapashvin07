import java.util.Scanner;
public class SortDig {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,temp,count=0,i,m_count=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            count=0;
            for(temp=a[i];temp!=0;temp/=10)
                count++;
            if(count>=m_count)
                m_count=count;
            else
                break;
        }
        if(i==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
