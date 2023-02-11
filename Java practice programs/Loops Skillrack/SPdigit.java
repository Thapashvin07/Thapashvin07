import java.util.Scanner;
class SPdigit
{
    public static void main(String[] args) {
        int i,sum=0,product=1,n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=n;i!=0;i/=10)
        {
            sum+=i%10;
            product*=i%10;
        }
        if(n%2==0)
            System.out.println(sum);
        else
            System.out.println(product);
    }
}