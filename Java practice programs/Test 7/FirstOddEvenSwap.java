import java.util.Scanner;
public class FirstOddEvenSwap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=0,j,k,temp,n;
        n=s.nextInt();
        int a[]=new int[8];
        for(temp=n;temp!=0;temp/=10)
            a[i++]=temp%10;
        for(j=i-1;j>=0;j--)
        {
            if(a[j]%2==0)
                break;
        }
        for(k=i-1;k>=0;k--)
        {
            if(a[k]%2!=0)
                break;
        }
        temp=a[j];
        a[j]=a[k];
        a[k]=temp;
        for(j=i-1;j>=0;j--)
            System.out.print(a[j]);
    }
}
