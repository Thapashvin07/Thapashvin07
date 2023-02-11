import java.util.Scanner;
public class ReplaceRepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j,k;
        s=sc.next();
        char a[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            a[i]=s.charAt(i);
        for(i=0;i<s.length();i++)
        {
            System.out.print(a[i]);
            k=1;
            for(j=i+1;j<s.length();j++)
            {
                if(a[j]==a[i])
                {
                    if(a[j]=='z')
                        System.out.print((char)(96+(k++)));
                    else
                        System.out.print((char)(a[i]+(k++)));
                    i=j;
                }
                else{
                    i=j-1;
                    break;
                }

            }
        }
    }
}
