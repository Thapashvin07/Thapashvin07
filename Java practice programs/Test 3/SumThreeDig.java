import java.util.Scanner;
public class SumThreeDig {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int temp,n,sum=0;
        n=s.nextInt();
        for(temp=n;temp!=0;temp/=1000)
            sum+=temp%1000;
        System.out.println(sum);
    }
}
