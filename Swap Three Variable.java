class Main
{
	static int a, b, c;

	static void swapThree()
	{
		a = a + b + c; 
		b = a - (b + c); 
		c = a - (b + c); 
	}
	public static void main(String []args)
	{
		a = 10; b = 20; c = 30;
		System.out.println("Before swapping a = " +a + ", b = " + b +", c = " + c);					
		swapThree();
		System.out.println("After swapping a = " + a + ", b = " + b +", c = " + c);
	}
}
