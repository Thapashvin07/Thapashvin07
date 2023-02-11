import java.util.Scanner;
public class NxtPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,i,j;
        x=s.nextInt();
        y=s.nextInt();
        for(i=x+1;;i++)
        {
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    break;
            }
            if(j==i/2+1)
                break;
        }
        if(i==y)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
