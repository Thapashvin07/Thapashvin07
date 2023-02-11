import java.util.Scanner;
public class Concat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,z,max=0,max2=0;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        if(x>y)
        {
            if(x>z)
            {
                max=x;
                if(y>z)
                    max2=y;
                else
                    max2=z;
            }
            else
            {
                max=z;
                if(x>y)
                    max2=x;
                else
                    max2=y;
            }
        }
        else
        {
            if(y>z)
            {
                max=y;
                if(x>z)
                    max2=x;
                else
                    max2=z;
            }
            else
            {
                max=z;
                if(x>y)
                    max2=x;
                else
                    max2=y;
            }
        }
        System.out.println(max+""+max2);
    }
}
