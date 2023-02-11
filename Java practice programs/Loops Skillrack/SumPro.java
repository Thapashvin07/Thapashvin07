import java.util.Scanner;
class SumPro
{
    public static void main(String[] args) {
        int i,sum=0,x,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        x=s.nextInt();
        for(i=n;i!=0;i/=10)
        {
            sum=sum+i%10;
        }
        System.out.println(sum*x);
    }
}