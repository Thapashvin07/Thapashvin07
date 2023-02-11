import java.util.Scanner;
public class SubLarge {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,max;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        max=a[0];
        for(i=1;i<n;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        for(i=0;i<a.length;i++)
            System.out.print(max-a[i]+" ");
    }
}
