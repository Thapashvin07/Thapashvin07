import java.util.Scanner;
public class Drake {
    public static void main(String arg[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int i,j,count=0;
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            count=0;
            for(j=i;j<s.length();j++)
            {
                if(!(b[j]=='a'||b[j]=='e'||b[j]=='i'||b[j]=='o'||b[j]=='u'))
                    count++;
            }
            System.out.print(count+"\t");
        }
    }
}
