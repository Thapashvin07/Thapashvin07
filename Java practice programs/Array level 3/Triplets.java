import java.util.Scanner;
public class Triplets {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,k,n,temp;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        label:for(i=0;i<n;i++)
        {
            temp=a[i]*a[i];
            for(j=i+1;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                    if(temp==(a[j]*a[j])+(a[k]*a[k]))
                    {
                        System.out.println("YES");
                        break label;
                    }
                }
            }
        }
        if(i==n)
            System.out.println("NO");
    }
}
