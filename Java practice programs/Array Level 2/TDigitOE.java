import java.util.Scanner;
public class TDigitOE {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,t_digit,c1=0,c2=0;
        n=s.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            t_digit=(a[i]/10)%10;
            if(t_digit%2!=0)
                c1++;
            else
                c2++;
        }
        if(c1>c2)
        {
            for(i=0;i<n;i++)
            {
                if(((a[i]/10)%10)%2!=0)
                    System.out.print(a[i]+"\t");
            }
        }
        else if(c1<c2)
        {
            for(i=0;i<n;i++)
            {
                if(((a[i]/10)%10)%2==0)
                    System.out.print(a[i]+"\t");
            }
        }
        else
            System.out.println("-1");
    }
}
