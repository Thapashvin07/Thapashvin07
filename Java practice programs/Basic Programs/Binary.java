import java.util.Scanner;
class Binary
{
    public static void main(String[] args) {
        int i,n,temp,j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[]a=new int[20];
        for(temp=n,i=0;temp!=0;temp/=2,i++)
            a[i]=temp%2;
        for(j=i-1;j>=0;j--)
            System.out.print(a[j]);
    }
}