import java.util.Scanner;
public class StrCount {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int r,c,i,j,k,l=0,count=0;
        s=sc.next();
        r=sc.nextInt();
        c=sc.nextInt();
        char a[][]=new char[r][c];
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
                a[i][j]=sc.next().charAt(0);
        }   
        for(i=0;i<r;i++)
        {
            for(j=0;j<=c-s.length();j++)
            {
                l=j;
                for(k=0;k<s.length();k++)
                {
                    if(a[i][l]!=b[k])
                        break;
                    l++;
                }
            if(k==s.length())
                count++;
            }
        }
        System.out.println(count);
    }
}