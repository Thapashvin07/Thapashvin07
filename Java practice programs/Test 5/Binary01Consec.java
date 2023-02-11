import java.util.Scanner;
public class Binary01Consec {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=0,j,temp,n;
        int a[]=new int[11];
        n=s.nextInt();
        for(temp=n;temp!=0;temp/=2)
            a[i++]=temp%2;
        System.out.print(a[i-1]);
        for(j=i-2;j>=0;j--)
        {
            if(a[j]==a[j+1])
                System.out.print(a[j]);
            else
                System.out.print("\n"+a[j]);
        }
    }
}
