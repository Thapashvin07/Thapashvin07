import java.util.Scanner;
public class RotateK {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        int i,j,k,temp;
        s1=sc.next();
        s2=sc.next();
        k=sc.nextInt();
        char a[]=new char[s1.length()];
        for(i=0;i<s1.length();i++)    
            a[i]=s1.charAt(i);    
        for(i=0;i<k;i++)    
        {
            temp=a[s1.length()-1];
            for(j=s1.length()-1;j>0;j--)    
                a[j]=a[j-1];
            a[0]=(char)temp;
        }
        String obj=new String (a);
        if(obj.compareTo(s2)!=0)
            System.out.println("NO");
        else    
            System.out.println("YES"+obj);
    }
}
