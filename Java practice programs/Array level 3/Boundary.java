//Matrix Boundary Integers
import java.util.Scanner;
class Boundary
{
	public static void main(String arg[])
	{
		int i,j=0,row,col,k;
		Scanner s=new Scanner(System.in);
		row=s.nextInt();
		col=s.nextInt();
		k=s.nextInt();
		int[][] a=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		System.out.println();
		}
		label:for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if((i==0||j==0||i==row-1||j==col-1)&&(a[i][j]!=k))
				{
					System.out.println("No");
					break label;
				}		
			}
		}
		if(i==row)
			System.out.println("Yes");
	}
}