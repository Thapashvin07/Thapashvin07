import java.util.Scanner;
public class MEvenInt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m,n,i,count=0;
        m=s.nextInt();
        n=s.nextInt();
        int a[]=new int[m];
        for(i=0;i<m;i++)
            a[i]=s.nextInt();
        for(i=0;i<m;i++)
        {
            if(a[i]%2==0 && count<n)
            {
                System.out.print(a[i]+" ");
                count++;
            }
        }
        if(count==0)
            System.out.println("-1");
    }
}
