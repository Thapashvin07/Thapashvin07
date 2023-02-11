//Binary Of Binary
import java.util.Scanner;
class BinaryOfBinary
{
	public int toBinary(int num)
	{
		int a[]=new int [30];
		int i,j,bin=0,temp;
		for(temp=num,i=0;temp!=0;temp/=2,i++)
			a[i]=temp%2;
		for(j=i-1;j>=0;j--)
			bin=(bin*10)+a[j];
		return bin;
	}
	public static void main(String args[])
	{
		int result,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		BinaryOfBinary obj=new BinaryOfBinary();
		result=obj.toBinary(obj.toBinary(n));
		System.out.println(result);	
	}
}