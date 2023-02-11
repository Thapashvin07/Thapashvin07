import java.util.Scanner;
public class BinarySq {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,temp,j,k;
        n=s.nextInt();
        int a[]=new int[20];
        for(i=1;i<=n;i++)
        {
            for(temp=i*i,j=0;temp!=0;j++,temp/=2)
                a[j]=temp%2;
            for(k=j-1;k>=0;k--)
                System.out.print(a[k]);
            System.out.print("\t");
        }
    }
}
