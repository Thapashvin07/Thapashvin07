import java.util.Scanner;
public class DescOrder {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n;
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
                break;
        }
        if(i<n)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
