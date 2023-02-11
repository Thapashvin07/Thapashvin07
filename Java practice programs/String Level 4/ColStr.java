import java.util.Scanner;
public class ColStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int n,i,j,k,l,flag=0;
        n=sc.nextInt();
        s=sc.next();
        char a[][]=new char[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                a[i][j]=sc.next().charAt(0);
        }
        char b[]=new char[s.length()];
        for(i=0;i<s.length();i++)
            b[i]=s.charAt(i);
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-s.length();j++)
            {
                l=j;
                for(k=0;k<s.length();k++)
                {
                    if(a[l][i]!=b[k])
                        break;
                    l++;
                }
                if(k==s.length()){
                    System.out.print(i+" ");
                    flag=1;
                }
            }
        }
        if(flag!=1)
            System.out.println("-1");
    }
}
