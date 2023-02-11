import java.util.Scanner;
public class Discount {
    public static void main(String arg[]) 
    {
        int x,y;
        double total,discount;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        total=x*y;
        if(x>=2&&x<=4)
            discount=(total*10)/100;
        else if(x==5)
            discount=(total*20)/100;
        else if(x>5)
            discount=(total*50)/100;
        else
            discount=0;
        System.out.println(total-discount);
    }   
}
