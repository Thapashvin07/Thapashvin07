import java.util.Scanner;
class Palindrome
{
	public static void main(String arg[])	
	{
		int i,temp,start,end,rev,flag=0;
		Scanner s=new Scanner(System.in);
		start=s.nextInt();
		end=s.nextInt();
		for(i=start;i<=end;i++)
		{
			rev=0;
			for(temp=i;temp!=0;temp/=10)
				rev=rev*10+(temp%10);
		if(rev==i)
		{	
			System.out.println(i);
			flag=1;
		}
		}
	if(flag==0)
		System.out.println("-1");
	}
}