import java.util.Scanner;
public class PrevUd {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,u_digit,t_digit;
        n=s.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=1;i<n;i++)
        {
            u_digit=a[i-1]%10;
            t_digit=(a[i-1]/10)%10;
            System.out.print(u_digit*t_digit+"\t");
        }
    }
}
