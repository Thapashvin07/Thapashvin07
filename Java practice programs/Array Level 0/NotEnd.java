import java.util.Scanner;
public class NotEnd {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,x;
        n=s.nextInt();
        x=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(((a[i]*a[i]+x)%10!=5)&&((a[i]*a[i]+x)%10!=6))
                System.out.println(a[i]*a[i]+x+"\t");
        }
    }
}
