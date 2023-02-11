import java.util.Scanner;
class Palindromew
{
	public static void main(String arg[])
	{
		int start,end,i,rev,temp,flag=0;
		Scanner s=new Scanner(System.in);
		start=s.nextInt();
		end=s.nextInt();
		i=start;
		while(i<=end)
		{
			rev=0;
			temp=i;
			while(temp!=0)
			{
				rev=rev*10+(temp%10);
				temp/=10;
			}
			if(rev==i)
			{
				System.out.println(i);
				flag=1;
			}
		i++;
		}
	if(flag==0)
		System.out.println("-1");
	}
}