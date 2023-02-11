import java.util.Scanner;
public class MaxUp {
    public static void main(String arg[])
    {
        int i,n,max,index;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        max=a[0];
        index=0;
        for(i=1;i<n;i++)
        {
            if(max<a[i])
            {
                // max=a[i];
                index=i;
            }
        }
        for(i=0;i<=index;i++)
            System.out.println(a[i]+"\t");
    }
}
