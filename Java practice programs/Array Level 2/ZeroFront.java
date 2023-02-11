import java.util.Scanner;
public class ZeroFront {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
                System.out.print(a[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(a[i]!=0)
                System.out.print(a[i]+" ");
        }
    }   
}
