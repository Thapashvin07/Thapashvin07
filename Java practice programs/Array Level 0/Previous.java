import java.util.Scanner;
public class Previous {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.print(a[0]+"\t");
        for(i=1;i<n;i++)
        {
            if(a[i]>a[i-1]) 
                System.out.print(a[i]+"\t");
        }

    }
}
