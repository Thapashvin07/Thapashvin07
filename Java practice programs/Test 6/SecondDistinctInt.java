import java.util.Scanner;
public class SecondDistinctInt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=1;i<n;i++)
        {
            if(a[i]!=a[i-1])
            {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
