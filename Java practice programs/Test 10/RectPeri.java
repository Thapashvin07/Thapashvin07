import java.util.Scanner;
public class RectPeri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p,s;
        s=sc.nextDouble();
        p=sc.nextDouble();
        System.out.printf("%.2f",(p/2)-s);
    }
}
