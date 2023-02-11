import java.util.Scanner;
public class RevEven {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,temp,flag=0,j;
        n=s.nextInt();
        int a[]=new int[15];
        for(temp=n,i=0;temp!=0;i++,temp/=10)
            a[i]=temp%10;
        for(j=0;j<i-1;j++)
        {
            if(a[j]%2==0)
            {
                System.out.print(a[j]);
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("-1");
    }
}
