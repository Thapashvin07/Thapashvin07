import java.util.Scanner;
public class MaxDiff {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,n,max,min;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        max=a[0];
        min=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            else if(a[i]<min)
                min=a[i];
        }
        System.out.print(max-min);
    }
}
