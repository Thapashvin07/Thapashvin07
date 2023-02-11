import java.util.Scanner;
public class Common {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j;
        s=sc.nextLine();
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i=j+1)
        {
            if(b[i]==b[0])
            {
                for(j=i;j<s.length()&&b[j]!=' ';j++)
                    System.out.print(b[j]);
                System.out.print(" ");
            }
            else
            {
                for(j=i+1;j<s.length() && b[j]!=' ';j++)
                {

                }
            }
        }
    }
}
