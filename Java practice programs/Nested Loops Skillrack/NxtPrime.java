import java.util.Scanner;
public class NxtPrime {
    public static void main(String[] args) {
        int i,j,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=n+1;;i++)
        {
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    break;
            }
            if(j==i/2+1)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
