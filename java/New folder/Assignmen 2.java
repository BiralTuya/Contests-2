/*class Vehicle{
	int registration_no;
	String type;
	int no_of_wheel;
	String color;
	float available_fuel;
	boolean condition;
	
	int getregno(){
		return registration_no;
	}
	String gettype(){
		return type;
	}
	int getwheel(){
		return no_of_wheel;
	}
	String getcolor(){
		return color;
	}
	float getfuel(){
		return available_fuel;
	}
	boolean getcn(){
		return condition;
	}
	void regno(int newValue){
		this.registration_no=newValue;
		return;
	}
	void type(String newtype){
		this.type=newtype;
		return;
	}
	void wheel(int newwheel){
		this.no_of_wheel=newwheel;
		return;
	}
	void color(String newclr){
		this.color=newclr;
		return;
	}
	void fuel(float newfuel){
		this.available_fuel=newfuel;
		return;
	}
	void cn(boolean cndtn){
		this.condition=cndtn;
		return;
	}
}

class Computer{
	String cpu_type;
	String type1;
	float cpu_speed;
	String mother_board;
	int ram_capacity;
	float hdd_capacity;
	int graphics;
	float price;
	
	String getcpu(){
		return cpu_type;
	}
	String gettype1(){
		return type1;
	}
	float getspeed(){
		return cpu_speed;
	}
	String getmb(){
		return mother_board;
	}
	int getram(){
		return ram_capacity;
	}
	float gethc(){
		return hdd_capacity;
	}
	int getgr(){
		return graphics;
	}
	float getpr(){
		return price;
	}
	void cpu(String newValue){
		this.cpu_type=newValue;
	}
	void type1(String newtype1){
		this.type1=newtype1;
	}
	void speed(float spd){
		this.cpu_speed=spd;
	}
	void mother(String mb){
		this.mother_board=mb;
	}
	void ram(int rc){
		this.ram_capacity=rc;
	}
	void hc(float hc){
		this.hdd_capacity=hc;
	}
	void gr(int gr){
		this.graphics=gr;
	}
	void pr(float pr){
		this.price=pr;
	}
}

class Cellphone{
	String brand;
	String family_name;
	String model_no;
	int battery;
	boolean keyboard_type;
	boolean sim_type;
	boolean is_available;
	
	String getbrand(){
		return brand;
	}
	String getfn(){
		return family_name;
	}
	String getmn(){
		return model_no;
	}
	int getbattery(){
		return battery;
	}
	boolean getkt(){
		return keyboard_type;
	}
	boolean getst(){
		return sim_type;
	}
	boolean getia(){
		return is_available;
	}
	void brand(String newValue){
		this.brand=newValue;
	}
	void fn(String newtype){
		this.family_name=newtype;
	}
	void mn(String mb){
		this.model_no=mb;
	}
	void battery(int bt){
		this.battery=bt;
	}
	void kt(boolean keyt){
		this.keyboard_type=keyt;
	}
	void st(boolean simt){
		this.sim_type=simt;
	}
	void ia(boolean isav){
		this.is_available=isav;
	}
}
class Main{
	public static void main(String[] args){
		Vehicle vehicle1 = new Vehicle();
		
		vehicle1.regno(1246);
		vehicle1.type("Car");
		vehicle1.wheel(4);
		vehicle1.color("Red");
		vehicle1.fuel(44.4f);
		vehicle1.cn(true);
		
		System.out.println("Registration no: "+vehicle1.getregno());
		System.out.println("Type is: "+vehicle1.gettype());
		System.out.println("No of wheels: "+vehicle1.getwheel());
		System.out.println("Color: "+vehicle1.getcolor());
		System.out.println("Available fuel: "+vehicle1.getfuel());
		System.out.println("Condition: "+vehicle1.getcn());
		
		Computer cp1 = new Computer();
		
		cp1.cpu("Desktop");
		cp1.type1("Core i7");
		cp1.speed(2.3f);
		cp1.mother("Intel DG33");
		cp1.ram(3);
		cp1.hc(500.00f);
		cp1.gr(3);
		cp1.pr(63000f);
		
		System.out.print("\n");
		System.out.println("Type is: "+cp1.gettype1());
		System.out.println("CPU Type is: "+cp1.getcpu());
		System.out.println("CPU speed: "+cp1.getspeed());
		System.out.println("Motherboard: "+cp1.getmb());
		System.out.println("RAM: "+cp1.getram());
		System.out.println("HDD: "+cp1.gethc());
		System.out.println("Graphics: "+cp1.getgr());
		System.out.println("Price is: "+cp1.getpr());
		
		Cellphone p1 = new Cellphone();
		
		p1.brand("Samsung");
		p1.fn("galaxy");
		p1.mn("s7");
		p1.battery(3000);
		p1.kt(true);
		p1.st(true);
		p1.ia(true);
		
		System.out.print("\n");
		System.out.println("Type is: "+p1.getbrand());
		System.out.println("CPU Type is: "+p1.getfn());
		System.out.println("CPU speed: "+p1.getmn());
		System.out.println("Motherboard: "+p1.getbattery());
		System.out.println("RAM: "+p1.getkt());
		System.out.println("HDD: "+p1.getst());
		System.out.println("Graphics: "+p1.getia());
	}
}
	
*/