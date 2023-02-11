import java.util.Scanner;
public class NxtCons {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        int i;
        ch=sc.next().charAt(0);
        if(ch=='z')
            ch='a';
        for(i=ch+1;;i++)
        {
            if(!(i=='a'||i=='e'||i=='o'||i=='i'||i=='u'))
            {
                System.out.printf("%c",i);
                break;
            }
        }
    }
}
