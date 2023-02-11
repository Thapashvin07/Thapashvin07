import java.util.Scanner;
public class RevLastX {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,x;
        n=s.nextInt();
        x=s.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=n-1;i>x;i--)
            System.out.println(a[i]);
    }
}
