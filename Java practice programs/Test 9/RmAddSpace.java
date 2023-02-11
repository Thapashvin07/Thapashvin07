import java.util.Scanner;
public class RmAddSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j;
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
            if(s.charAt(i)==' ')
            {
                for(j=i+1;j<s.length();j++)
                {
                    if(s.charAt(j+1)!=' ')
                    {     
                        i=j;
                        break;
                    }
                }
            }
        }
    }
}
