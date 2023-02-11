import java.util.Scanner;
public class DigitalLocker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p,u;
        int i,j;
        u=sc.next();
        p=sc.next();
        for(i=0;i<u.length();i++)
        {
            for(j=0;j<p.length();j++)
            {
                if(p.charAt(j)==u.charAt(i))
                    break;
            }
            if(j!=p.length())
            {
                System.out.println("INVALID");
                break;
            }
        }
        if(i==u.length())
            System.out.println("VALID");
    }
}
