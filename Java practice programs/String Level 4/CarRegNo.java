import java.util.Scanner;
public class CarRegNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        String s;
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)>47 && s.charAt(i)<58)
                sum=sum+(int)(s.charAt(i))-48;
        }
        System.out.println(sum);
    }                          
}
