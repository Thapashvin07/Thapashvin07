import java.util.Scanner;
public class MaxRepeat {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,count,max_count=1,val=0,n;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            count=1;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                    count++;
            }
            if(count>max_count)
            {
                max_count=count;
                val=a[i];
            }
        }
        if(max_count>1)
            System.out.println(val);
        else
            System.out.println("1");
    }
}
