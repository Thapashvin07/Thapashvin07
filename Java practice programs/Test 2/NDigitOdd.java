import java.util.Scanner;
public class NDigitOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,temp,n,flag=0;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            temp=i;
            while(temp!=0)
            {
                if((temp%10)%2==0)
                    break;
                temp/=10;
            }
            if(temp==0)
            {
                System.out.print(i+" ");
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("-1");
    }
}
