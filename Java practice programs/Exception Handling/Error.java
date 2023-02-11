public class Error {
    public static void main(String[] args) {
        int a[]={5,10};
        int b=5;
        try{
            int x=a[2]/(b-a[0]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound");
        }
        catch(ArrayStoreException e){
            System.out.println("Array store exception");
        }
        int y=a[1]/a[0];
        System.out.println("y="+y);;
    }    
}
