import java.util.Scanner;
public class FactorsDesc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i;
        n=s.nextInt();
        System.out.print(n+" ");
        for(i=n/2;i>0;i--)
        {
            if(n%i==0)
                System.out.print(i+" ");
        }    
    }
    
}
