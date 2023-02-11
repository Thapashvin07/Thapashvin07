import java.util.Scanner;
public class OddEven12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i=0,temp,j;
        n=s.nextInt();
        int a[]=new int[9];
        for(temp=n;temp!=0;temp/=10)
            a[i++]=temp%10;
        for(j=i-1;j>=0;j--)
        {
            if(a[j]%2==0)
                System.out.print("1");
            else
                System.out.print("2");
        }
    }
}
