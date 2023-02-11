import java.util.Scanner;
public class SumMaxDig {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,max,max_sum=0;
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        max=a[0];    
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        for(i=max;i!=0;i/=10)
            max_sum=max_sum+(i%10);
        for(i=0;i<n;i++)
            System.out.printf("%.2f\t",(double)a[i]/max_sum);
    }
}
