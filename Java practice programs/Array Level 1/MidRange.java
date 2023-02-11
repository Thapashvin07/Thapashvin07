import java.util.Scanner;
public class MidRange {
    public static void main(String agr[])
    {
        Scanner s=new Scanner(System.in);
        int i,n ;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=1;i<n-1;i++)
        {
            if(!(a[i]>a[0] && a[i]<a[n-1]))
                break;
        }
        if(i==n-1)
            System.out.println("YES");
        else
            System.out.println("no");
    }
}
