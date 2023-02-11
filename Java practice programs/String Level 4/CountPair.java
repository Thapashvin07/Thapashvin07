import java.util.Scanner;
public class CountPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();
        int i,count=0,j;
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            a[i]=s.charAt(i);
        for(i=0;i<s.length()-1;i++)
        {
            if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'))
            {
                if(!(a[i+1]=='a'||a[i+1]=='e'||a[i+1]=='i'||a[i+1]=='o'||a[i+1]=='u'||a[i+1]=='E'||a[i+1]=='E'||a[i+1]=='I'||a[i+1]=='O'||a[i+1]=='U'))
                    count++;
            }
        }
        System.out.println(count);
    }
}
