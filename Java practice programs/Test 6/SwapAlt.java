import java.util.Scanner;
public class SwapAlt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,n,temp;
        n=s.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i+=3)
        {
            temp=a[i];
            a[i]=a[i+2];
            a[i+2]=temp;
        }
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
