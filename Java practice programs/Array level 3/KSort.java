import java.util.Scanner;
public class KSort {
    public static void main(String arg[])
    {
        int i,j,k,n,temp;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        k=s.nextInt();
        for(i=0;i<k;i++)
        {
            for(j=i+1;j<k;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }  
        for(i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                System.out.println("NO");
                break;
            }
        }
        if(i==n-1)
            System.out.println("YES");
    }
}
