import java.util.Scanner;
public class Circum {
    public static void main(String args[])   
    {
        double radius,pi=3.14,circum;
        Scanner s=new Scanner(System.in);
        radius=s.nextDouble();
        circum=2*pi*radius;
        // System.out.println(String.format("%.3f",area));
        System.out.printf("%.2f",circum);
    }
}
