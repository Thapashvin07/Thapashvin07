import java.util.Scanner;
public class ProdHalf {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,rem1,rem,temp,count=0;
        n=s.nextInt();
        for(temp=n;temp!=0;temp/=10)
            count++;
        rem=n/(int)Math.pow(10,count/2);
        rem1=n%(int)Math.pow(10,count/2);
        System.out.println(rem*rem1);
    }
}
