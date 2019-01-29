class BasicCalculator implements BasicInterface{
	public int sum(int x, int y)
	{
		return x+y;
	}
	public int sub(int x, int y)
	{
		return x-y;
	}
	public int multiplication(int x, int y)
	{
		return x*y;
	}
	public int division(int x, int y)
	{
		return x/y;
		
	}
}
class ScientificCalculator implements Scicalinterface{
	public int mod(int x,int y)
	{
		return x%y;
	}
	public int tothepower(int x, int y)
	{
		return (int)Math.pow(x,y);
	}
	public double root(int x)
	{
		return Math.sqrt(x);
	}
	
	public double sin(double a)
	{
		return Math.round(Math.sin(Math.toRadians(a))*1000.0)/1000.0;
	}
	public double cos(double a)
	{
		return Math.round(Math.cos(Math.toRadians(a))*1000.0)/1000.0;
	}
	public double tan(double a)
	{
	return Math.round(Math.tan(Math.toRadians(a))*1000.0)/1000.0;
	}
	public double log(double x) 
	{
		return Math.log10(x);
	}
}
class calculator{
	public static void  main(String[] args) {
		BasicCalculator C1=new BasicCalculator();
		System.out.println(C1.sum(5,5));
		System.out.println(C1.sub(15,5));
		System.out.println(C1.multiplication(10,9));
		System.out.println(C1.division(20,5));
		
		ScientificCalculator C2 =new ScientificCalculator();
		System.out.println(C2.mod(50,6));
		System.out.println(C2.tothepower(5,3));
		System.out.println(C2.root(16));
		System.out.println(C2.sin(30.0));
		System.out.println(C2.cos(30.0));
		System.out.println(C2.log(69.32));
		System.out.println();
		
	}
}