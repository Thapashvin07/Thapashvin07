import java.util.Scanner;
public class SumCurPrev {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.print(a[0]+a[n-1]+" ");
        for(i=1;i<n;i++)
            System.out.print(a[i]+a[i-1]+" ");
    }
}
