import java.util.Scanner;
public class DigitWO {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,d,i,temp;
        n=s.nextInt();
        d=s.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(temp=a[i];temp!=0;temp/=10)
            {
                if(temp%10==d)
                    break;
            }
            if(temp==0)
                System.out.print(a[i]+"\t");
        }
    }
}
