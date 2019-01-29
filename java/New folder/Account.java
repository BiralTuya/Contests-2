/*class Account{
	private String accountnumber;
	private String accountname;
	private double accountbalance;

	public String getnum(){
		return accountnumber;
	}
	public String getname(){
		return accountname;
	}
	public double getbal(){
		return accountbalance;
	}
	public void setnum(String num){
		this.accountnumber=num;
		return;
	}
	public void setname(String name){
		this.accountname=name;
		return;
	}
	public void setbal(double bal){
		this.accountbalance=bal;
		return;
	}

	public boolean withdraw(double tk){
		if(tk>0){
			this.accountbalance-=tk;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean deposite(double taka){
		if(taka>0){
			this.accountbalance+=taka;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean transfer(Account ac1, double x){
		if(x<=this.accountbalance){
			withdraw(x);
			ac1.deposite(x);
			return true;
		}
		else
			return false;
	}

	public void display(){
		System.out.print("Account: "+this.getname());
		System.out.println(" ["+this.getnum()+"]");
		System.out.println("Balance: "+this.getbal()+" tk.");
		System.out.println("Deposit: "+this.deposite(120));
		System.out.println("Withdraw: "+this.withdraw(-120));
		System.out.println("Balance: "+this.getbal()+" tk.");
	}
}

class Main{
	public static void main(String[] args){
	Account ac1[]={new Account(),new Account()};

		ac1[0].setnum("14-27512-3");
		ac1[0].setname("Tuya");
		ac1[0].setbal(444.55);
		System.out.println("Account 1#");
		ac1[0].display();
		
		ac1[1].setnum("14-27500-3");
		ac1[1].setname("Sanzila");
		ac1[1].setbal(888.55);
		System.out.println("Account 2#");
		ac1[1].display();
		
		System.out.println("After transfer#");
		ac1[0].transfer(ac1[1],100);
		ac1[1].display();
	}
}
*/