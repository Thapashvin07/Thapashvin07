import java.util.Scanner;
public class TwoOddDigit {
    public static void main(String arg[])
    {
        int i,sum=0,temp,count,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int [n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            count=0;
            for(temp=a[i];temp!=0;temp/=10)
            {
                if((temp%10)%2!=0)
                count++;                
            }
            if(count>=2)
                sum+=a[i];
        }
        System.out.println(sum);
    }
}
