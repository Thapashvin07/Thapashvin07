import java.util.Scanner;
public class CountSum {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,c=0,sum;
        n=s.nextInt();
        int a[]=new int [n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        sum=a[0]+a[n-1];
        for(i=0;i<n;i++)
        {
            if(a[i]==sum)
                c++;
        }
    System.out.println(c);
    }
}
