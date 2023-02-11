import java.util.Scanner;
public class Unique2Int {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i+=2)
        {
            if(a[i]==a[i+1])
                break;
        }
        if(i>=n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
