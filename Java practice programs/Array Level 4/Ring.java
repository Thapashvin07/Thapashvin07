import java.util.Scanner;
public class Ring {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,row,col;
        row=s.nextInt();
        col=s.nextInt();
        int a[][]=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
                a[i][j]=s.nextInt();
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(i==0||j==0||i==row-1||j==col-1)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
