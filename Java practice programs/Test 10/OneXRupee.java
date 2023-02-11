import java.util.Scanner;
public class OneXRupee {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m,n,x,k;
        x=s.nextInt();
        m=s.nextInt();
        n=s.nextInt();
        k=s.nextInt();
        if((x*n)+m==k)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
