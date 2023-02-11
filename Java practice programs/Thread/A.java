class A extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
	public static void main(String arg[])
	{
		A obj=new A();
		obj.start();
	}
}