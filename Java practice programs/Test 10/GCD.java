import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,z,min=0,i;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        if(x<y)
        {
            if(x<z)
                min=x;
            else
                min=z;
        }
        else
        {
            if(y<z)
                min=y;
            else
                min=z;
        }
        for(i=min;i>0;i--)
        {
            if((x%i==0)&&(y%i==0)&&(z%i==0))
            {
                System.out.println(i);
                break;
            }
        }
    }
}
