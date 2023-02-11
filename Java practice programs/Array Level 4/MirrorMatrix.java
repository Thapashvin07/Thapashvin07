import java.util.Scanner;
public class MirrorMatrix {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,temp,row,col;
        row=s.nextInt();
        col=s.nextInt();
        int a[][]=new int [row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
                a[i][j]=s.nextInt();
        }
        for(i=0;i<row;i++)
        {
            for(j=col-1;j>=0;j--)
            {
                for(temp=a[i][j];temp!=0;temp/=10)
                    System.out.print(temp%10);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
