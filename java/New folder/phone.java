class cellphone{
	String brand;
	String family_name;
	String model_no;
	int battery;
	boolean keyboard_type;
	boolean sim_type;
	boolean is_available;
	void brand(String newValue){
		brand=newValue;
	}
	void fn(String newtype){
		family_name=newtype;
	}
	void mn(String mb){
		model_no=mb;
	}
	void battery(int bt){
		battery=bt;
	}
	void kt(boolean keyt){
		keyboard_type=keyt;
	}
	void st(boolean simt){
		sim_type=simt;
	}
	void ia(boolean isav){
		is_available=isav;
	}
	void print(){
		System.out.println("Type is: "+type);
		System.out.println("CPU Type is: "+cpu_type);
		System.out.println("CPU speed: "+cpu_speed);
		System.out.println("Motherboard: "+mother_board);
		System.out.println("RAM: "+ram_capacity);
		System.out.println("HDD: "+hdd_capacity);
		System.out.println("Graphics: "+graphics);
		System.out.println("Price is: "+price);
	}
}
class Main{
	public static void main(String[] args){
		Computer cp1 = new Computer();
		
		cp1.cpu("Desktop");
		cp1.type("Core i7");
		cp1.speed(2.3f);
		cp1.mother("Intel DG33");
		cp1.ram(3);
		cp1.hc(500.00f);
		cp1.gr(3);
		cp1.pr(63000f);
		cp1.print();
	}
}
	
