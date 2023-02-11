import java.util.Scanner;
public class Max {
    public static void main(String arg[])
    {
        int i,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        if(a[0]>a[n/2])
        {
            if(a[0]>a[n-1])
                System.out.println(a[0]);
            else
                System.out.println(a[n-1]);
        }
        else{
            if(a[n/2]>a[n-1])
                System.out.println(a[n/2]);
            else
                System.out.println(a[n-1]);
        }
    }
}
