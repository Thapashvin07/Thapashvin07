import java.util.Scanner;
public class CountRs {
    public static void main(String arg[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();  
        int c_five,c_two,rem;
        c_five=n/5;
        rem=n%5;
        c_two=rem/2;
        rem=rem%2;
        if(c_five!=0)
            System.out.println("Count of Rs 5:"+c_five);
        if(c_two!=0)
            System.out.println("Count of Rs 2:"+c_two);
        if(rem!=0)
            System.out.println("Count of Rs 1:"+rem);
    }
}
