import java.util.Scanner;
public class FiboRev {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,s=-1,b=1,j;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s+b;
            s=b;
            b=a[i];
        }
        for(j=i-1;j>=0;j--)
            System.out.print(a[j]+" ");
    }
}
