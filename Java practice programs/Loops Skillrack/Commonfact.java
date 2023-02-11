import java.util.Scanner;
public class Commonfact {
    public static void main(String args[])
    {
        int x,y,i,min;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        if(x<y)
            min=x;
        else
            min=y;
        for(i=1;i<=min;i++)
        {
            if(x%i==0 && y%i==0)
                System.out.print(i+"\t");
        }
    }
}
