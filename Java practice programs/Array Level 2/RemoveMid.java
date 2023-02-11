import java.util.Scanner;
public class RemoveMid {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,temp,i=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(temp=n,i=0;temp!=0;temp/=10,i++)
            a[i]=temp%10;
        System.out.print(a[i-1]+",");
        System.out.print(a[0]);
    }
}
