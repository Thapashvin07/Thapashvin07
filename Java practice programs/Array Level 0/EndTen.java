import java.util.Scanner;
public class EndTen {
    public static void main(String args[])
    {
        int i,n,flag=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]%100==10)
            {
                System.out.print(a[i]+"\t");
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("-1");
    }
}
