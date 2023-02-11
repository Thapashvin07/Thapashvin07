import java.util.Scanner;
public class StartEnd {
    public static void main(String arg[])    
    {
        Scanner sc=new Scanner(System.in);
        int i;
        String s;
        s=sc.next();
        for(i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+""+s.charAt(s.length()-1-i));
            if(s.charAt(i)==s.charAt(s.length()-1-i))
                break;
        }
    }   
}
