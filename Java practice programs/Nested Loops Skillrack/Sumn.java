import java.util.Scanner;
public class Sumn {
    public static void main(String[] args) {
        int i,j,n,sum,k=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=0;
            for(j=1;j<=i;j++)
            {
                sum+=k;
                k++;
            }   
            System.out.println(sum);
        }
    }
}
