import java.util.Scanner;
public class Power2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,temp;
        n=s.nextInt();
        for(temp=n;temp!=1;temp/=2)
        {
            System.out.print("2");
            if(temp/2!=1)
                System.out.print("*");
        }
    }
}
