import java.util.Scanner;
public class LargeToSmall {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,z,i,max,min;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        if(x>y)
        {
            if(x>z)
            {
                max=x;
                if(z<y)
                    min=z;
                else
                    min=y;
            }
            else
            {
                max=z;
                min=y;
            }
        }
        else
        {
            if(y>z)
            {
                max=y;
                if(x<z)
                    min=x;
                else
                    min=z;
            }
            else
            {
                max=z;
                min=x;
            }
        }
        System.out.println(max+" "+min);
        for(i=max;i>=min;i--)
            System.out.print(i+" ");
    }
}
