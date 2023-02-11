import java.util.Scanner;
public class VarDiscount {
    public static void main(String agrgs[]) {
        int price;
        double discount=0;
        Scanner s = new Scanner(System.in);
        price = s.nextInt();
        if(price<1000)
            discount=(double)price/10;
        else if(price>1000)
            discount=(double)(price-1000)*5/100+100;
        System.out.println(String.format("%.2f",discount));
    }

}
