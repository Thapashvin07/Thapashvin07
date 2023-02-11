import java.util.Scanner;
public class NxtConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        int i;
        if(ch>96)
        {
            for(i=ch+1;;i++)
            {
                if(!(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'))
                {
                    System.out.println((char)i);
                    break;
                }
                if(i=='z')  
                    i='a';
            }
        }
        else
        {
            for(i=ch+1;;i++)
            {
                if(!(i=='A'||i=='E'||i=='I'||i=='O'||i=='U'))
                {
                    System.out.println((char)i);
                    break;
                }
                if(i=='z')  
                    i='a';
            }
        }
    }
}
