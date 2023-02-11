import java.util.Scanner;
public class MinAdj {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n;
        n=s.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(i==0)
                System.out.print(a[i+1]-a[i]+" ");
            else if(i==n-1)
                System.out.print(a[i-1]-a[i]+" ");
            else
            {
                if(a[i-1]<a[i+1])
                    System.out.print(a[i-1]-a[i]+" ");
                else
                    System.out.print(a[i+1]-a[i]+" ");
            }
        }
    }
}
