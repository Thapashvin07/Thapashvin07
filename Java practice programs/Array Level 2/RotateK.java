import java.util.Scanner;
public class RotateK {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,j,k,temp;
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        k=s.nextInt();
        for(i=0;i<k;i++)
        {
            temp=a[n-1];
            for(j=n-1;j>0;j--)
                a[j]=a[j-1];
            a[0]=temp;
        }
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
