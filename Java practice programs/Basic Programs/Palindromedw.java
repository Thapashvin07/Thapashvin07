import java.util.Scanner;
class Palindromedw
{
	public static void main(String arg[])
	{
		int start,end,i,rev,temp,flag=0;
		Scanner s=new Scanner(System.in);
		start=s.nextInt();
		end=s.nextInt();
		i=start;
		do
		{
			rev=0;
			temp=i;
			do
			{
				rev=rev*10+(temp%10);
				temp/=10;
			}while(temp!=0);
			if(rev==i)
			{
				System.out.println(i);
				flag=1;
			}
		i++;
		}while(i<=end);
	if(flag==0)
		System.out.println("-1");
	}
}