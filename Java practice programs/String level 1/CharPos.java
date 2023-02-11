import java.util.Scanner;
public class CharPos {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int []a=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
            System.out.print((char)a[i]+" ");
    }
}
