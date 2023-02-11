import java.util.Scanner;
public class CircPrime {
    public int checkPrime(int n)
    {
        int i;
        for(i=2;i<n/2;i++)
        {
            if(n%i==0)
                break;
        }
        if(i==n/2)
            return 1;
        else
            return 0;
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x,val,temp,count=0,rem;
        n=sc.nextInt();
        x=n;
        for(temp=n;temp!=0;temp/=10)
            count++;
        for(i=0;i<count;i++)
        {
            val=x%10;
            rem=x/10;
            x=val*(int)Math.pow(10,count-1)+rem;
            CircPrime obj=new CircPrime();
            if(obj.checkPrime(x)!=1)
            {
                System.out.println("NO");
                break;
            }
        }
        if(i==count)
        System.out.println("YES");
    }
}
