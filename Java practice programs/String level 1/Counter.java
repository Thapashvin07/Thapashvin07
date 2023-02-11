import java.util.Scanner;
public class Counter {
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    String s;
    s=sc.next();
    int i,counter=0;
    for(i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='R')
            counter=0;
        else if(s.charAt(i)=='D')
            counter--;
        else if(s.charAt(i)=='I')
            counter++;
    }
    System.out.println(counter);
    }
}
