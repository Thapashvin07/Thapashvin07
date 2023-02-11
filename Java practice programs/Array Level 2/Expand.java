import java.util.Scanner;
public class Expand {
    public static void main(String arg[])
    {
        int i,j,k,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int []a=new int[n];
        for(i=n,j=0;i!=0;j++,i/=10)
            a[j]=i%10;
        for(i=j-1;i>=0;i--)
        {
            for(k=0;k<a[i];k++)
                System.out.print(a[i]);
        }
    }
}
