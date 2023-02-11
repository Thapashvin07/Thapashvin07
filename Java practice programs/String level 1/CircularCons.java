import java.util.Scanner;
public class CircularCons {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        char ch1,ch2;
        int i,count=0;
        ch1=sc.next().charAt(0);
        ch2=sc.next().charAt(0);
        for(i=ch1;i<=ch2;i++)
        {
            if(!(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'))
                count++;
        }
        System.out.println(count);
    }
}
