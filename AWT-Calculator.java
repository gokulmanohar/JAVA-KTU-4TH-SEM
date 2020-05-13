import java.awt.*;  
import java.awt.event.*; 
class AWT_Calculator extends Frame implements ActionListener
{
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, plus,minus,multiply,divide,equal,clear,dec;
TextField tf; 
float res;
static String stext="";
AWT_Calculator()
{
b0=new Button("0");
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
plus=new Button("+");
minus=new Button("-");
multiply=new Button("*");
divide=new Button("/");
equal=new Button("=");
clear=new Button("c");
dec=new Button(".");
tf = new TextField();
  
//setBounds(int x-coordinate, int y-coordinate, int width, int height)
tf.setBounds(30,60,230,30);
b7.setBounds(30,160,50,30);
b8.setBounds(70,160,50,30);
b9.setBounds(110,160,50,30);
b1.setBounds(30,100,50,30);
b2.setBounds(70,100,50,30);
b3.setBounds(110,100,50,30);
b4.setBounds(30,130,50,30);
b5.setBounds(60,130,60,30);
b6.setBounds(110,130,50,30);



b0.setBounds(60,190,50,30);
plus.setBounds(150,100,60,30);
minus.setBounds(150,130,60,30);
multiply.setBounds(200,100,60,30);
divide.setBounds(200,130,60,30);
equal.setBounds(150,160,60,30);
equal.setBackground(Color.YELLOW);
clear.setBounds(200,160,60,30);
dec.setBounds(30,190,50,30);
tf.setEditable(false);
	
b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
plus.addActionListener(this);
minus.addActionListener(this);
multiply.addActionListener(this);
divide.addActionListener(this);
equal.addActionListener(this);
clear.addActionListener(this);
dec.addActionListener(this);
addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e)
{
	dispose();
}
});	

add(tf);
add(b0);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(plus);
add(minus);
add(multiply);
add(divide);
add(equal);
add(clear);
add(dec);
setSize(300,300);
setLayout(null);
setVisible(true);	
}
public void actionPerformed(ActionEvent e)
{
// overriding the ActionListener interface method	
	if(e.getSource() == b0)
	{
		stext=stext+"0";
		tf.setText(stext);
	}	
	
	if(e.getSource() == b1)
	{
		stext=stext+"1";
		tf.setText(stext);
	}	
	
	if(e.getSource() == b2)
	{
		stext=stext+"2";
		tf.setText(stext);
	}	
	if(e.getSource() == b3)
	{
		stext=stext+"3";
		tf.setText(stext);
	}	
	if(e.getSource() == b4)
	{
		stext=stext+"4";
		tf.setText(stext);
	}
	if(e.getSource() == b5)
	{
		stext=stext+"5";
		tf.setText(stext);
	}	
	if(e.getSource() == b6)
	{
		stext=stext+"6";
		tf.setText(stext);
	}	
	if(e.getSource() == b7)
	{
		stext=stext+"7";
		tf.setText(stext);
	}	
	if(e.getSource() == b8)
	{
		stext=stext+"8";
		tf.setText(stext);
	}	
	if(e.getSource() == b9)
	{
		stext=stext+"9";
		tf.setText(stext);
	}	
	if(e.getSource() == plus)
	{
		stext=stext+" + ";
		tf.setText(stext);
	}	
	if(e.getSource() == minus)
	{
		stext=stext+" - ";
		tf.setText(stext);
	}	
	if(e.getSource() == multiply)
	{
		stext=stext+" * ";
		tf.setText(stext);
	}	
	if(e.getSource() == divide)
	{
		stext=stext+" / ";
		tf.setText(stext);
	}	
	if(e.getSource() == dec)
	{
		stext=stext+".";
		tf.setText(stext);
	}	
	if(e.getSource() == equal)
	{
        String[] words = stext.split(" ");
		//First operand
		String w1 = words[0];
		//Operator
		String w2 = words[1];
		//Second Operand
		String w3 = words[2];
		//Convertion
		float op1 = Float.parseFloat(w1);
		float op2 = Float.parseFloat(w3);
		if (w2.equals("+"))
		{
			res = op1 + op2;
		}
		else if (w2.equals("-"))
		{
			res = op1 - op2;
		}
		else if (w2.equals("*"))
		{
			res = op1 * op2;
		}
		else if (w2.equals("/"))
		{
			res = op1 / op2;
		}
		else{
			tf.setText("Error!");
		}
		//Again Convertion
		String ress = Float.toString(res);
        tf.setText(ress);

	}	
	if(e.getSource() == clear)
	{
		stext=" ";
		tf.setText(stext);
	}
}
public static void main(String args[])
{
AWT_Calculator calculate = new AWT_Calculator();
}
}
