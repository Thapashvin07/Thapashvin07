import java.util.Scanner;
public class SqrootDig {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i=0,temp,j;
        n=s.nextInt();
        int a[]=new int[7];
        for(temp=n;temp!=0;temp/=10)    
            a[i++]=temp%10;
        for(j=i-1;j>=0;j--)
            System.out.printf("%.2f ",Math.sqrt(a[j]));
    }
}
