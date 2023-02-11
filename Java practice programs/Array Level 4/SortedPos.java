import java.util.Scanner;
public class SortedPos {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,n,temp;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        int b[]=new int[n];
        for(i=0;i<n;i++)   
            b[i]=a[i];
        for(i=0;i<n-1;i++)
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
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(j+1);
                    break;
                }
            }
        }
    }
}
