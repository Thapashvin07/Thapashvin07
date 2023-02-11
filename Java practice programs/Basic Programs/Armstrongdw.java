import java.util.Scanner;
class Armstrongdw
{
	public static void main(String arg[])
	{
		int start,end,i,rem,sum,temp,flag=0;
		Scanner s=new Scanner(System.in);
		start=s.nextInt();
		end=s.nextInt();
		i=start;
		do
		{
			sum=0;
			temp=i;
				do{
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp/=10;
			}while(temp!=0);
			if(sum==i){
				System.out.println(i);
				flag=1;
			}
			i++;
		}while(i<=end);
	if(flag==0)
		System.out.println("-1");
	}
}