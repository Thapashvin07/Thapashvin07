import java.util.Scanner;
public class GreatK {
    public static void main(String arg[])
    {
        int n,k,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<k)
                break;
        }
        if(i==n)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
