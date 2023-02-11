import java.util.Scanner;
public class RevDigits {
    public static void main(String arg[])
    {
        int n,i,j,temp;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[]a=new int[15];
        for(temp=n,i=0;temp!=0;i++,temp/=10)
            a[i]=temp%10;
        for(j=i-3;j<i;j++)
            System.out.print(a[j]);
    }
}
