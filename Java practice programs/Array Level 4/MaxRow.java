import java.util.Scanner;
public class MaxRow {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int row,col,i,j,count,max_count=0;
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
            count=0;
            for(j=0;j<col;j++)
            {
                if(a[i][j]==1)
                    count++;
            }
            if(count>max_count)
                max_count=count;
        }
        System.out.println(max_count);
    }
}
