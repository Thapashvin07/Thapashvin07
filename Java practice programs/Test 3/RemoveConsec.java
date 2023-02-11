import java.util.Scanner;
public class RemoveConsec {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int temp,n;
        n=s.nextInt();
        if(n%2==0)
        {
            for(temp=n/10;temp!=0;temp/=10)
            {
                if(temp%2!=0)
                    break;
            }
        }
        else
        {
            for(temp=n/10;temp!=0;temp/=10)
            {
                if(temp%2==0)
                    break;
            }
        }
        System.out.println(temp);
    }
}
