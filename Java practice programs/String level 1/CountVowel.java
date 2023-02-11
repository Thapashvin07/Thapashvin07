import java.util.Scanner;
public class CountVowel {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,c_a=0,c_e=0,c_i=0,c_o=0,c_u=0;
        s=sc.next();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
                c_a++;
            if(s.charAt(i)=='e')
                c_e++;
            if(s.charAt(i)=='i')
                c_i++;
            if(s.charAt(i)=='o')
                c_o++;            
            if(s.charAt(i)=='u')
                c_u++;
        }
        System.out.print("a "+c_a+"\ne "+c_e+"\ni "+c_i+"\no "+c_o+"\nu "+c_u);
    }
}
