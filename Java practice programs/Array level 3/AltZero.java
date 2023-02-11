import java.util.Scanner;
class AltZero
{
	public static void main(String arg[])
	{
		int n,temp,i,j;
		Scanner s=new Scanner(System.in);
		int []a=new int [20];
		n=s.nextInt();
		for(temp=n,i=0;temp!=0;i++,temp/=2)
			a[i]=temp%2;
		for(j=i-1;j>0;j--)
		{
			if(a[j]==a[j-1])
				break;
		}
		if(j==0)
			System.out.println("Yes");
		else
			System.out.println("No");						
	}
}