import java.util.Scanner;
public class Parallelo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,j,k,n,count=1;
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
                System.out.print("-");
            for(k=0;k<n;k++)
            {
                if(i==0||i==n-1||k==0||k==n-1)
                    System.out.print("*");
                else
                    System.out.print(count++);

            }
            System.out.println();
        }
    }
}
