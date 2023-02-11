import java.util.Scanner;
public class AreaCircle {
    public static void main(String args[])   
    {
        double radius,pi=3.14,area;
        Scanner s=new Scanner(System.in);
        radius=s.nextDouble();
        area=pi*radius*radius;
        // System.out.println(String.format("%.3f",area));
        System.out.printf("%.2f",area);
    }
}
