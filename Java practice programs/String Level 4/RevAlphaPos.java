import java.util.Scanner;
public class RevAlphaPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        char a[]=new char[n];
        for(i=0;i<n;i++)
            a[i]=sc.next().charAt(0);
        for(i=n-1;i>=0;i--)
        {
            if(Character.isUpperCase(a[i])) 
                System.out.print((char)a[i]-64+" ");   
            else
                System.out.print((char)a[i]-96+" ");
        }
    }
}
