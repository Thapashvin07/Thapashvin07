import java.util.Scanner;
public class MulChar {
    public static void main(String arg[])
    {
        String s;
        int i,k,pos;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        k=sc.nextInt();
        char b[]=new char[s.length()];
        for(pos=k;;pos+=k)
        {
            i=(pos%s.length())-1;
            if(i==-1)
            {
                System.out.print(s.charAt(s.length()-1));
                break;
            }
            System.out.print(s.charAt(i));
        }
    }
}
