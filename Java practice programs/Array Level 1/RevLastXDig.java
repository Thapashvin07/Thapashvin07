import java.util.Scanner;
public class RevLastXDig
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,x,temp,j;
        n=s.nextInt();
        x=s.nextInt();
        int a[]=new int[n];
        for(temp=n,i=0;temp!=0;temp/=10,i++)
            a[i]=temp%10;
        for(j=i-1;j>=x;j--)
            System.out.print(a[j]);
        for(j=0;j<x;j++)
            System.out.print(a[j]);
    }
}