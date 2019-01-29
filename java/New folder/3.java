class Main{
	String brand="Samsung";
	String family_name="galaxy";
	String model_no="s7";
	int battery=3000;
	boolean keyboard_type=true;
	boolean sim_type=true;
	boolean is_available=true;
	
	
	int registration_no=3;
	String type="Car";
	int no_of_wheel=2;
	String color="Black";
	float available_fuel=44.6f;
	boolean condition=true;
	
	String cpu_type="Laptop";
	String type1="Core i7";
	float cpu_speed=2.3f;
	String mother_board="Intel";
	int ram_capacity=2;
	float hdd_capacity=500f;
	int graphics=2;
	float price=63000f;
	
	String house_no="48B";
	char block='A';
	int road_no=5;
	String area="Mirpur";
	String police_station="Mirpur";
	String post_office="Mirpur";
	int postal_code=1216;
	String district="Dhaka";
	String division="Dhaka";
	String country="Bangladesh";
	
	public static void main(String[] args){
		Main obj1=new Main();
		System.out.println("brand is: "+obj1.brand);
		System.out.println("family name: "+obj1.family_name);
		System.out.println("model no: "+obj1.model_no);
		System.out.println("battery: "+obj1.battery);
		System.out.println("sim type: "+obj1.keyboard_type);
		System.out.println("keyboard type: "+obj1.sim_type);
		System.out.println("availabality: "+obj1.is_available);
		
		Main obj2=new Main();
		System.out.println("reg no: "+obj2.registration_no);
		System.out.println("type is: "+obj2.type);
		System.out.println("wheels: "+obj2.no_of_wheel);
		System.out.println("color: "+obj2.color);
		System.out.println("fuel: "+obj2.available_fuel);
		System.out.println("condition: "+obj2.condition);
		
		Main obj3=new Main();
		System.out.println("type: "+obj3.type1);
		System.out.println("cpu type: "+obj3.cpu_type);
		System.out.println("speed: "+obj3.cpu_speed);
		System.out.println("motherboard: "+obj3.mother_board);
		System.out.println("ram: "+obj3.ram_capacity);
		System.out.println("hdd: "+obj3.hdd_capacity);
		System.out.println("graphics: "+obj3.graphics);
		System.out.println("price: "+obj3.price);
		
		
		Main obj4=new Main();
		System.out.println("house no: "+obj4.house_no);
		System.out.println("block: "+obj4.block);
		System.out.println("road no: "+obj4.road_no);
		System.out.println("area: "+obj4.area);
		System.out.println("police station: "+obj4.police_station);
		System.out.println("post office: "+obj4.post_office);
		System.out.println("postal code: "+obj4.postal_code);
		System.out.println("district: "+obj4.district);
		System.out.println("division: "+obj4.division);
		System.out.println("country: "+obj4.country);
		
	}
}