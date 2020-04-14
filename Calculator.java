package calci;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
                                
public class Calculator implements ActionListener {
	JFrame f=new JFrame("Calculator");
	JTextField tf = new JTextField(32);
	JButton one,two,three,four,five,six,seven,eight,nine,zero,b0,bon,bc,add,div,mul,sub,decml,back,equals,fact,pow;
	double res;
	int vl;
	
	int operation;
	Calculator(){
	 b0 = new JButton("off");
	 bon = new JButton("on");
	 bc = new JButton("Clr");
	one = new JButton("1");
	two = new JButton("2");
	three = new JButton("3");
	four = new JButton("4");
	five = new JButton("5");
	six = new JButton("6");
	seven = new JButton("7");
	eight = new JButton("8");
	nine = new JButton("9");
	zero = new JButton("0");
	add = new JButton("+");
	sub = new JButton("-");
    mul = new JButton("*");
	div = new JButton("/");
	back = new JButton("<-");
	decml = new JButton(".");
	equals = new JButton("=");
	fact =new JButton("!");
	pow =new JButton("^");
	
	//f.add(p);
	tf.setBounds(30, 40, 280,30); 
	tf.setEditable(false);
	
	back.setBounds(40, 100, 50, 40);
	bc.setBounds(110, 100, 50, 40);
	bon.setBounds(180, 100, 120, 40);
	
	nine.setBounds(40, 170, 50, 40);
	eight.setBounds(110, 170, 50, 40);
	seven.setBounds(180, 170, 50, 40);
	add.setBounds(250, 170, 50, 40);
	
	four.setBounds(40, 240, 50, 40);
	five.setBounds(110, 240, 50, 40);
	six.setBounds(180, 240, 50, 40);
	sub.setBounds(250, 240, 50, 40);
	
	three.setBounds(40, 310, 50, 40);
	two.setBounds(110, 310, 50, 40);
	one.setBounds(180, 310, 50, 40);
	div.setBounds(250, 310, 50, 40);
	
	zero.setBounds(40, 380, 50, 40);
	decml.setBounds(110, 380, 50, 40);
	equals.setBounds(180, 380, 50, 40);
	mul.setBounds(250, 380, 50, 40);
	
	b0.setBounds(40, 450, 120, 40);
	fact.setBounds(180,450,50,40);
	pow.setBounds(250,450,50,40);

	JPanel p=new JPanel();
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(350, 560);
	f.setLayout(null);
	f.add(p);
	f.add(tf);
	f.add(b0);
	f.add(back);
	f.add(bc);
	f.add(bon);
	f.add(nine);
	f.add(eight);
	f.add(seven);
	f.add(add);
	f.add(four);
	f.add(five);
	f.add(six);
	f.add(sub);
	f.add(three);
	f.add(two);
	f.add(one);
	f.add(div);
	f.add(zero);
	f.add(decml);
	f.add(equals);
	f.add(mul);
	f.add(fact);
	f.add(pow);
	
	b0.addActionListener(this);
	back.addActionListener(this);
	bc.addActionListener(this);
	bon.addActionListener(this);
	
	nine.addActionListener(this);
	eight.addActionListener(this);
	seven.addActionListener(this);
	add.addActionListener(this);
	
	four.addActionListener(this);
	five.addActionListener(this);
	six.addActionListener(this);
	sub.addActionListener(this);
	
	three.addActionListener(this);
	one.addActionListener(this);
	two.addActionListener(this);
	div.addActionListener(this);
	
	zero.addActionListener(this);
	decml.addActionListener(this);
	equals.addActionListener(this);
	mul.addActionListener(this);
	
	fact.addActionListener(this);
	pow.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String in=e.getActionCommand();
		if(in=="1"){
			tf.setText(tf.getText()+"1");
		}
		if(in=="2"){
			tf.setText(tf.getText()+"2");
		}
		if(in=="3"){
			tf.setText(tf.getText()+"3");
		}
		if(in=="4"){
			tf.setText(tf.getText()+"4");
		}
		if(in=="5"){
			tf.setText(tf.getText()+"5");
		}
		if(in=="6"){
			tf.setText(tf.getText()+"6");
		}
		if(in=="7"){
			tf.setText(tf.getText()+"7");
		}
		if(in=="8"){
			tf.setText(tf.getText()+"8");
		}
		if(in=="9"){
			tf.setText(tf.getText()+"9");
		}
		if(in=="0"){
			tf.setText(tf.getText()+"0");
		}
		 if(in=="+"){
			tf.setText(tf.getText()+"+");
			 operation=1;
		 }
		if(in=="-"){
			tf.setText(tf.getText()+"-");
			operation=2;
		}
		if(in=="*"){
			tf.setText(tf.getText()+"*");
			operation=3;
		}
		if(in=="/"){
			tf.setText(tf.getText()+"/");
			operation=4;
		}
		if(in=="."){
			tf.setText(tf.getText()+".");
		}
		if(in=="Clr"){
			tf.setText("");
		}
		if(in=="off"){
			disable();
		}
		if(in=="on"){
			enable();
		}
		if(in=="<-"){
			tf.setText(tf.getText().substring(0, tf.getText().length()-1));
		}
		if(in=="!"){
			tf.setText(tf.getText()+"!");
			operation=5;
		}
		if(in=="^"){
			tf.setText(tf.getText()+"^");
			operation=6;
		}
		if(in=="="){
			calculation();
			
		}
		
	}
	public void disable(){
		tf.setText("");
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		zero.setEnabled(false);
		div.setEnabled(false);
		add.setEnabled(false);
		mul.setEnabled(false);
		sub.setEnabled(false);
		equals.setEnabled(false);
		decml.setEnabled(false);
		back.setEnabled(false);
		bc.setEnabled(false);
		bon.setEnabled(true);
		b0.setEnabled(false);
		fact.setEnabled(false);
		pow.setEnabled(false);
		
	}
	public void enable(){
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		zero.setEnabled(true);
		div.setEnabled(true);
		add.setEnabled(true);
		mul.setEnabled(true);
		sub.setEnabled(true);
		equals.setEnabled(true);
		decml.setEnabled(true);
		back.setEnabled(true);
		bc.setEnabled(true);
		bon.setEnabled(false);
		b0.setEnabled(true);
		fact.setEnabled(true);
		pow.setEnabled(true);
	}
	
	public void calculation() {
		switch(operation){
		
		case 1 :
			String str=tf.getText();
			String[] vl=new String[10];
			vl=str.split("\\+");
			res=Double.parseDouble(vl[0])+Double.parseDouble(vl[1]);
			tf.setText(Double.toString(res));
			
			break;
		case 2: 
			String str1=tf.getText();
			String[] vl1=new String[10];
			vl1=str1.split("\\-");
	
			res=Double.parseDouble(vl1[0])-Double.parseDouble(vl1[1]);
			tf.setText(Double.toString(res));
			
			break;
		case 3 :
			String str2=tf.getText();
			String[] vl2=new String[10];
			vl2=str2.split("\\*");
			
			res=Double.parseDouble(vl2[0])*Double.parseDouble(vl2[1]);
	
			tf.setText(Double.toString(res));
			
			break;
        case 4 :
        	String str3=tf.getText();
			String[] vl3=new String[10];
			
			vl3=str3.split("/");
			try{
				res=(Double.parseDouble(vl3[0]))/(Double.parseDouble(vl3[1]));
				tf.setText(String.valueOf(res));
				
			}
			catch(ArithmeticException e){
				tf.setText("math error");
			}
			break;
        case 5 :
			String str4;
			str4=tf.getText().substring(0, tf.getText().length()-1);
			long k=Long.parseLong(str4);
			long factorial=1;
			if(k==0){
				factorial=1;
			}
			else{
			for(int i=1;i<=k;i++){
				factorial*=i;
			}
			}
			tf.setText(String.valueOf(factorial));
			break;
        case 6 :
			String str5=tf.getText();
			String[] vl5=new String[10];
			vl5=str5.split("\\^");
			int result=1;
			int n=Integer.parseInt(vl5[0]);
			int m=Integer.parseInt(vl5[1]);
			while(m>=1){
				result*=n;
				m--;
			}
	
			tf.setText(String.valueOf(result));
			break;
			default:
				tf.setText("invalid operator");
		}
	}
	public static void main(String[] args){
		Calculator c = new Calculator();
	}
	
}
