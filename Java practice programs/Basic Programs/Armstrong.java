import java.util.Scanner;
class Armstrong
{
	public static void main(String arg[])
	{
		int i,j,rem,start,end,sum,temp,flag=0;
		Scanner s=new Scanner(System.in);
		start=s.nextInt();
		end=s.nextInt();
		for(i=start;i<=end;i++)
		{
			sum=0;
			for(temp=i;temp!=0;temp/=10)
			{
			rem=temp%10;
			sum+=(rem*rem*rem);
			}
			if(sum==i){
				System.out.println(i);
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("-1");
	}
}