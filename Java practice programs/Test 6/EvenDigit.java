import java.util.Scanner;
public class EvenDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,temp,flag=0,i;
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(temp=a[i];temp!=0;temp/=10)
            {
                if((temp%10)%2!=0)
                    break;
            }
            if(temp==0)
            {
                System.out.print(a[i]+" ");
                flag=1;
            }
        }
        if(flag!=1)
            System.out.println("-1");
    }
}
