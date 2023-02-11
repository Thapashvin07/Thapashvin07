import java.util.Scanner;
public class EqualWater {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,z,max=0;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        if(x>y)
        {
            if(x>z)
                max=x;
            else
                max=z;
        }
        else
        {
            if(y>z)
                max=y;
            else
                max=z;
        }
        System.out.println((max-x)+(max-y)+(max-z));
    }
}
