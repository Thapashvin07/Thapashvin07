import java.util.Scanner;
public class PrevKInt {
    public static void main(String[] arg)
    {
        int i,n,k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        i=n-k;
        while(i<=n)
        {
            System.out.println(i);;
            i++;
        }
    }
}
