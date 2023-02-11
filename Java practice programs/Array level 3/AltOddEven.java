import java.util.Scanner;
public class AltOddEven {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i;
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n-1;i++)
        {
            if((a[i]%2==0 && a[i+1]%2==0)||(a[i]%2!=0 && a[i+1]%2!=0))
                break;
        }
        if(i==n-1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
