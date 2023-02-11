import java.util.Scanner;
public class RmvPrimeDig {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,temp,sum=0,sum_1=0,i=0,j;
        x=s.nextInt();
        y=s.nextInt();
        int a[]=new int[8];
        for(temp=x;temp!=0;temp/=10)
            a[i++]=temp%10;
        for(j=i-1;j>=0;j--)
        {
            if(!(a[j]==2||a[j]==3||a[j]==5||a[j]==7))
                sum=sum*10+a[j];
        }
        for(temp=y,i=0;temp!=0;temp/=10)
            a[i++]=temp%10;
        for(j=i-1;j>=0;j--)
        {
            if(!(a[j]==2||a[j]==3||a[j]==5||a[j]==7))
                sum_1=sum_1*10+a[j];
        }
        System.out.println(sum+sum_1);
    }
}
