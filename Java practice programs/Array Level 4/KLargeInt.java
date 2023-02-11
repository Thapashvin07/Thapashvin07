import java.util.Scanner;
public class KLargeInt {
    public static void main(String arg[])
    {
        int i,n,k,j,temp;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(a[n-1-k]);
    }
}
