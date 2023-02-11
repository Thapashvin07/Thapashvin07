import java.util.Scanner;

public class Decimalw {
    public static void main(String arg[])
    {
        Scanner s =new Scanner(System.in);
        int i=0,n,temp,sum=0;
        n=s.nextInt();
        temp=n;
        while(temp!=0){
            sum=sum+((temp%10)*(int)Math.pow(2,i));
            i++;
            temp/=10;
        }   
        System.out.println(sum);
    }
    
}
