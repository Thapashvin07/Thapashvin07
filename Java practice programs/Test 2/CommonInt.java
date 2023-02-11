import java.util.Scanner;
public class CommonInt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x1,x2,y1,y2,start,end;
        x1=s.nextInt();
        x2=s.nextInt();
        y1=s.nextInt();
        y2=s.nextInt();
        end=x2;
        for(start=x1;start<=end;start++)
        {
            if(start>=y1 && start<=y2)
                System.out.print(start+" ");
        }
    }
}
