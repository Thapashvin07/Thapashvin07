import java.util.Scanner;
public class StrForm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="";
        int n,x,i,j=0;
        n=sc.nextInt();
        x=sc.nextInt();
        s+=(char)(x+96);
        for(i=1;i<n;i++)
            s+=(char)((j++)%x+97);
        System.out.println(s);
    }
}
