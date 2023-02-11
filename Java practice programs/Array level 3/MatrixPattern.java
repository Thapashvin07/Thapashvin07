import java.util.Scanner;
public class MatrixPattern {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,k,l,n,temp;
        n=s.nextInt();
        int[]a=new int[n];
        for(temp=n,i=0;temp!=0;i++,temp/=10)
            a[i]=temp%10;
        for(j=0;j<a[i-1];j++)
        {
            for(k=i-1;k>=0;k--)
            {
                for(l=0;l<a[i-1];l++)
                    System.out.print(a[k]);
            }
            System.out.println();
        }
    }
}
