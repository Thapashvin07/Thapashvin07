import java.util.Scanner;
public class Frame {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int m,n,i,j;
        m=s.nextInt();
        n=s.nextInt();
        int[][]a=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                a[i][j]=s.nextInt();
        }
        for(i=0;i<n+2;i++)
            System.out.print("*");
        System.out.println();
        for(i=0;i<m;i++)
        {
            System.out.print("*");
            for(j=0;j<n;j++)
                System.out.print(a[i][j]);
            System.out.println("*");
        }
        for(i=0;i<n+2;i++)
            System.out.print("*");  
    }
}
