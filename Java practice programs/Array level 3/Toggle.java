//Binary toggle last occuring
import java.util.Scanner;
class Toggle
{
	public static void main(String args[])
	{
		int i,j,n,decimal=0,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int []a=new int [30];
		for(temp=n,i=0;temp!=0;temp/=2,i++)
			a[i]=temp%2;
		for(j=0;j<i;j++)//given i because last value wont be 1 as it is reversed
		{
			if(a[j]==1)
			{
				a[j]=0;
				break;
			}
		}
	for(j=0;j<i;j++)
		decimal=decimal+(a[j]*(int)Math.pow(2,j));
	System.out.println(decimal);
	}
}