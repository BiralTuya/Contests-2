import javax.swing.*;

class MyFrame extends JFrame{
	JLabel nameLabel1;
	JLabel nameLabel2;
	JLabel nameLabel3;
	JLabel nameLabel4;
	JTextField nameTextField;
	JButton showButton;
	JButton showButton2;
	JButton showButton3;
	JButton showButton4;
	JRadioButton RButton;
	JRadioButton RButton2;
	JCheckBox Cb;
	JCheckBox Cb1;
	JCheckBox Cb2;
	JCheckBox Cb3;
	JComboBox cmb;
	
	public MyFrame(){
		nameLabel1 =new JLabel("Name");
		this.add(nameLabel1);
		nameLabel1.setBounds(10,10,100,30);
		
		nameTextField =new JTextField();
		this.add(nameTextField);
		nameTextField.setBounds(10,50,250,30);
		
		showButton =new JButton("Show");
		this.add(showButton);
		showButton.addActionListener(this);
		showButton.setBounds(10,100,100,30);
		
		nameLabel2 =new JLabel("Gender");
		this.add(nameLabel2);
		nameLabel2.setBounds(10,170,100,30);
		
		RButton =new JRadioButton();
		RButton.setText("Female");
		this.add(RButton);
		RButton.setBounds(10,200,70,30);
		
		RButton2 =new JRadioButton();
		RButton2.setText("Male");
		this.add(RButton2);
		RButton2.setBounds(75,200,100,30);
		
		showButton2 =new JButton("Show");
		this.add(showButton2);
		showButton2.setBounds(10,230,100,30);
		
		nameLabel3 =new JLabel("Degree");
		this.add(nameLabel3);
		nameLabel3.setBounds(10,280,100,30);
		
		Cb= new JCheckBox("MSc");
		this.add(Cb);
		Cb.setBounds(10,300,100,30);
		
		Cb1= new JCheckBox("BSc");
		this.add(Cb1);
		Cb1.setBounds(10,330,100,30);
		
		Cb2= new JCheckBox("HSC");
		this.add(Cb2);
		Cb2.setBounds(10,360,100,30);
		
		Cb3= new JCheckBox("SSC");
		this.add(Cb3);
		Cb3.setBounds(10,390,100,30);
		
		showButton3 =new JButton("Show");
		this.add(showButton3);
		showButton3.setBounds(10,420,100,30);
		
		showButton3 =new JButton("Show");
		this.add(showButton3);
		showButton3.setBounds(10,420,100,30);
		
		nameLabel4 =new JLabel("Blood Group");
		this.add(nameLabel4);
		nameLabel1.setBounds(10,450,100,30);
		
		cmb= new JComboBox();
		this.add(cmb);
		cmb.setBounds(10,480,100,30);
		cmb.addItem("A+");
		cmb.addItem("B+");
		cmb.addItem("AB+");
		
		showButton4 =new JButton("Show");
		this.add(showButton4);
		showButton4.setBounds(10,520,100,30);
		
		this.setSize(250,250);
		this.setLayout(null);
		this.setVisible(true);
	}
}

class FormTest{
	public static void main(String[] args){
	new MyFrame();
	}
}