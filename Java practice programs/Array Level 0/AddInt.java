import java.util.Scanner;
public class AddInt {
     public static void main(String[] args) {
        int n,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n-1;i++)
            System.out.print(a[i]+a[i+1]+"\t");
    }    
}
