import java.util.Scanner;
public class SumDice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,x,y,sum=0;
        for(i=0;;i++)
        {
            x=s.nextInt();
            y=s.nextInt();
            if(x!=y)
                break;
            sum+=x+y;
        }
        System.out.println(sum);
    }
}
