import java.util.Scanner;
public class LastOdd {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n;
        n=s.nextInt();
        int[]a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=n-1;i>=0;i--)
        {
            if(a[i]%2!=0)
            {
                System.out.println(a[i]+" ");
                break;
            }
        }
        while(i>=0)
        {
            System.out.println(a[i]+" ");   
            i--;
        }
    }
}