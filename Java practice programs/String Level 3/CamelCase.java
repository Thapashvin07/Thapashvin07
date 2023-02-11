import java.util.Scanner;
public class CamelCase {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        char b[]=new char[s.length()];
        int i;
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            if(b[i]==' ')
            {
                System.out.printf("%c",b[i+1]-32);
                i++;
            }
            else
                System.out.printf("%c",b[i]);
        }
    }
}
