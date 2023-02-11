import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,odd_c=0,even_c=0;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
                even_c++;
            else
                odd_c++;
        }
        if(even_c < odd_c)
        {
            for(i=0;i<n;i++)
            {
                if(a[i]%2!=0)
                    System.out.print(a[i]+1+" ");
            }
        }
        else if(even_c > odd_c)
        {
            for(i=0;i<n;i++)
            {
                if(a[i]%2==0)
                    System.out.print(a[i]-1+" ");
            }
        }
        else
        {
            for(i=0;i<n;i++)
            {
                if(a[i]%2!=0)
                    System.out.print(a[i]+1+" ");
                else
                    System.out.print(a[i]-1+" ");
            }
        }
    }
}
