import java.util.Scanner;
public class AddSub {
    public static void main(String arg[])
    {
        int i,n,x;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        x=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
                System.out.println(a[i]+x+"\t");
            else    
                System.out.println(a[i]-x+"\t");
        }
    }
}
