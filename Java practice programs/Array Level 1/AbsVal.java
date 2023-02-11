import java.util.Scanner;
public class AbsVal {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,sum=0;
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]<0)
                sum-=a[i];
            else
                sum+=a[i];
        }
        System.out.println(sum);
    }
}
