import java.util.Scanner;
public class EqualOddEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,temp,sum_o=0,sum_e=0;
        n=s.nextInt();
        for(i=10;i<=n;i++)
        {
            sum_e=0;
            sum_o=0;
            for(temp=i;temp!=0;temp/=10)
            {
                if((temp%10)%2==0)
                    sum_e+=(temp%10);
                else
                    sum_o+=(temp%10);
            }
            if(sum_e==sum_o)
                System.out.print(i+" ");
        }
    }
}
