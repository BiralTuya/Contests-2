import javax.swing.*;

class Frame extends JFrame{
	JLabel namelabel1,namelabel2,namelabel3;
	JComboBox cmb;
	JTextField txt;
	JButton btn1,btn2;
	
	public Frame(){
		namelabel1 =new JLabel("What do you want to add?");
		this.add(namelabel1);
		namelabel1.setBounds(10,10,200,30);
		
		cmb= new JComboBox();
		this.add(cmb);
		cmb.setBounds(10,40,100,30);
		cmb.addItem("Theory");
		cmb.addItem("Lab");
		
		namelabel2 =new JLabel("Enter your grade (in point) below:");
		this.add(namelabel2);
		namelabel2.setBounds(10,70,200,30);
		
		txt =new JTextField();
		this.add(txt);
		txt.setBounds(10,110,100,30);
		
		btn1 =new JButton("Add Another");
		this.add(btn1);
		//btn1.addActionListener(this);
		btn1.setBounds(10,140,120,30);
		
		btn2 =new JButton("Get Result!");
		this.add(btn2);
		//btn2.addActionListener(this);
		btn2.setBounds(10,180,100,30);
		
		namelabel3 =new JLabel("Your CGPA is: ");
		this.add(namelabel3);
		namelabel3.setBounds(10,210,200,30);
		
		this.setSize(250,250);
		this.setLayout(null);
		this.setVisible(true);
	}
}
	class Main{
	public static void main(String[] args){
	JFrame.setDefaultLookAndFeelDecorated(true);
	new Frame();
	}
}