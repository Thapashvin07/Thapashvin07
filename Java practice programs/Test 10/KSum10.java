import java.util.Scanner;
public class KSum10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k,temp,sum=0;
        k=s.nextInt();
        for(temp=k;temp!=0;temp/=10)
            sum+=(temp%10);
        if(sum!=0)
            sum=10-sum;
        System.out.println(k+""+sum);
    }
}
