import java.util.Scanner;
public class IntNX {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,x,i,j;
        n=s.nextInt();
        x=s.nextInt();
        for(i=0;i<x;i++)
        {
            for(j=1;j<=n;j++)
                System.out.print(j+" ");
        }
    }
}
