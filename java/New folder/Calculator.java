interface BasicCalculatorInterface{
int sum(int x, int y);
int sub(int x, int y);
int multiplication(int x, int y);
int division(int x, int y);
}
interface ScientificCalculatorInterface{
int XtoY(int x, int y);
}
class BasicCalculator implements BasicCalculatorInterface{}
class ScientificCalculator implements ScientificCalculatorInterface{}
class Test{
	public static void main(String[] args){
		BasicCalculator s1 = new BasicCalculator();
		ScientificCalculator s2 = new ScientificCalculator();
		//s1.sum();
		//s.XtoY();
		
	}
}