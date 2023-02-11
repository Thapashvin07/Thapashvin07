import java.util.Scanner;
class Armstrongw
{
	public static void main(String arg[])
	{
		int start,end,i,rem,sum,temp,flag=0;
		Scanner s=new Scanner(System.in);
		start=s.nextInt();
		end=s.nextInt();
		i=start;
		while(i<=end)
		{
			sum=0;
			temp=i;
			while(temp!=0){
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp/=10;
			}
			if(sum==i){
				System.out.println(i);
				flag=1;
			}
			i++;
		}
	if(flag==0)
		System.out.println("-1");
	}
}