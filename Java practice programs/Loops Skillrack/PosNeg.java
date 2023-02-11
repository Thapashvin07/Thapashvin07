import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args)
    {
        int i,n,sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
                sum+=i;
            else
                sum-=i;
        }
        System.out.println(sum);
    }
}
