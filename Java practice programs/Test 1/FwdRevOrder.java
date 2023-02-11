import java.util.Scanner;
public class FwdRevOrder {
    public static void main(String[] args) {
        int x,y,z,i,min,min2;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        if(x>z)
        {
            min=z;
            min2=x;
        }
        else
        {
            min=x;
            min2=z;
        }
        for(i=min;i<=min2;i++)
            System.out.print(i+" ");
        for(i=y;i>=min2;i--)
            System.out.print(i+" ");
    }
}
