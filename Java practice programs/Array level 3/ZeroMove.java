import java.util.Scanner;
public class ZeroMove {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,row,col;
        row=s.nextInt();
        col=s.nextInt();
        int[][]a=new int [row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)  
                a[i][j]=s.nextInt();
        }
        for(i=0;i<row;i++)
        {
            if((i+1)%2!=0)
            {
                for(j=0;j<col;j++)  
                {
                    if(a[i][j]==0)
                        System.out.print(a[i][j]);
                }
                for(j=0;j<col;j++)  
                {
                    if(a[i][j]!=0)
                        System.out.print(a[i][j]);
                }
                System.out.println();
            }
            else
            {
                for(j=0;j<col;j++)  
                {
                    if(a[i][j]!=0)
                        System.out.print(a[i][j]);
                }
                for(j=0;j<col;j++)  
                {
                    if(a[i][j]==0)
                        System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }
}
