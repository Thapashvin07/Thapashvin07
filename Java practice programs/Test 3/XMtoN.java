import java.util.Scanner;
public class XMtoN {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m,n,x,i,sum=0;
        m=s.nextInt();
        n=s.nextInt();
        x=s.nextInt();
        for(i=m;i<=n;i++)
        {
            if(i%x==0)
                sum+=i;
        }
        if(sum==0)
            System.out.println("-1");
        else
            System.out.println(sum);
    }
}
