import java.util.Scanner;
public class CountLast2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,count=0;
        s=sc.next();
        for(i=0;i<s.length();i++)
        {
            if(s.substring(i,i+1).equals(s.substring(s.length()-2,s.length()-1)))
                count++;
        }
        System.out.println(count);  
    }
}
