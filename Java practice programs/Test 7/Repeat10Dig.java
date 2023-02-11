import java.util.Scanner;
public class Repeat10Dig {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,temp,t,i=0,j;
        n=s.nextInt();
        int a[]=new int [8];
        for(temp=n;temp!=0;temp/=10)
            a[i++]=temp%10;
        t=a[1];
        for(j=i-1;j>=0;j--)
        {
            for(temp=0;temp<t;temp++)
                System.out.print(a[j]);
        }
    }
}
