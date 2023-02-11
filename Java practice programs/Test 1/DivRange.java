import java.util.Scanner;
public class DivRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,z,i;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        for(i=1;;i++){
            if(!(i>=x && i<=y)&& i%z==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
