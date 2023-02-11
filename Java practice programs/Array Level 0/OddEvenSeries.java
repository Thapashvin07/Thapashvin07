import java.util.Scanner;
public class OddEvenSeries {
    public static void main(String arg[])
    {
        int i,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
                System.out.print(a[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
                System.out.print(a[i]+" ");
        }
    }
}
