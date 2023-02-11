import java.util.Scanner;
public class Cone {
    public static void main(String args[])   
    {
        double radius,pi=3.14,area,height;
        Scanner s=new Scanner(System.in);
        radius=s.nextDouble();
        height=s.nextDouble();
        area=(pi*radius*radius*height)/3;
        // System.out.println(String.format("%.3f",area));
        System.out.printf("%.2f",area);
    }
}
