import java.util.Scanner;
public class CircularCons {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        int i;
        ch=sc.next().charAt(0);
        for(i=1;i<26;i++)
        {
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                System.out.print(ch);
            ch++;
            if(ch=='z')
                ch='a';
        }
    }

}
