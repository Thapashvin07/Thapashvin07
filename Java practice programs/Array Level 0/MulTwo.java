import java.util.Scanner;
public class MulTwo {
    public static void main(String arg[])
    {
        int i,n,flag=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];;
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if((a[i]*2)%10!=2)
            {
                System.out.print(a[i]*2+"\t");
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("-1");
    }
}
