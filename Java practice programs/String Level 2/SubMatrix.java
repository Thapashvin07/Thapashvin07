import java.util.Scanner;
public class SubMatrix {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,m,n;
        m=s.nextInt();
        n=s.nextInt();
        char b[][]=new char[m][m];
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
                b[i][j]=s.next().charAt(0);
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if((i<n && j<n)||(i<n && j>=m-n)||(i>=m-n && j<n)||(i>=m-n && j>=m-n))
                    System.out.print(b[i][j]);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
