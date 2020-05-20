//This is a simple java awt calculator with two operands and can perform addition, subtraction, multiplication and division.

import java.awt.*;  
import java.awt.event.*; 
class AWT_Calculator extends Frame implements ActionListener
{
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, minus, multiply, divide, equal, dec;
	TextField tf; 
	float res;
	static String stext="";
	AWT_Calculator()
	{
		tf = new TextField(10);
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		divide=new Button("/");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		multiply=new Button("*");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		minus=new Button("-");
		dec=new Button(".");
		b0=new Button("0");
		equal=new Button("=");
		plus=new Button("+");

		//font formating
		final Font font = new Font("Arial", 0, 18);

		//setBounds(int x-coordinate, int y-coordinate, int width, int height)
		tf.setBounds(50,50,280,50);
		tf.setEditable(false);
		tf.setFont(font);

		b7.setBounds(50,120,70,50);
		b7.setFont(font);
		b8.setBounds(120,120,70,50);
		b8.setFont(font);
		b9.setBounds(190,120,70,50);
		b9.setFont(font);
		divide.setBounds(260,120,70,50);
		divide.setFont(font);

		b4.setBounds(50,175,70,50);
		b4.setFont(font);
		b5.setBounds(120,175,70,50);
		b5.setFont(font);
		b6.setBounds(190,175,70,50);
		b6.setFont(font);
		multiply.setBounds(260,175,70,50);
		multiply.setFont(font);

		b1.setBounds(50,230,70,50);
		b1.setFont(font);
		b2.setBounds(120,230,70,50);
		b2.setFont(font);
		b3.setBounds(190,230,70,50);
		b3.setFont(font);
		minus.setBounds(260,230,70,50);
		minus.setFont(font);

		dec.setBounds(50,285,70,50);
		dec.setFont(font);
		b0.setBounds(120,285,70,50);
		b0.setFont(font);
		equal.setBounds(190,285,70,50);
		equal.setFont(font);
		equal.setBackground(Color.YELLOW);
		plus.setBounds(260,285,70,50);
		plus.setFont(font);

			
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
		dec.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(final WindowEvent e)
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
		add(dec);
		setSize(380, 380);
        setBackground(Color.darkGray);
		setLayout(null);
		setVisible(true);	
	}

	public void actionPerformed(final ActionEvent e) {
		if (e.getSource() == b0) {
			stext = stext + "0";
			tf.setText(stext);
		}

		if (e.getSource() == b1) {
			stext = stext + "1";
			tf.setText(stext);
		}

		if (e.getSource() == b2) {
			stext = stext + "2";
			tf.setText(stext);
		}
		if (e.getSource() == b3) {
			stext = stext + "3";
			tf.setText(stext);
		}
		if (e.getSource() == b4) {
			stext = stext + "4";
			tf.setText(stext);
		}
		if (e.getSource() == b5) {
			stext = stext + "5";
			tf.setText(stext);
		}
		if (e.getSource() == b6) {
			stext = stext + "6";
			tf.setText(stext);
		}
		if (e.getSource() == b7) {
			stext = stext + "7";
			tf.setText(stext);
		}
		if (e.getSource() == b8) {
			stext = stext + "8";
			tf.setText(stext);
		}
		if (e.getSource() == b9) {
			stext = stext + "9";
			tf.setText(stext);
		}
		if (e.getSource() == plus) {
			stext = stext + " + ";
			tf.setText(stext);
		}
		if (e.getSource() == minus) {
			stext = stext + " - ";
			tf.setText(stext);
		}
		if (e.getSource() == multiply) {
			stext = stext + " * ";
			tf.setText(stext);
		}
		if (e.getSource() == divide) {
			stext = stext + " / ";
			tf.setText(stext);
		}
		if (e.getSource() == dec) {
			stext = stext + ".";
			tf.setText(stext);
		}
		if (e.getSource() == equal) {
			final String[] words = stext.split(" ");
			final String w1 = words[0];
			final String w2 = words[1];
			final String w3 = words[2];
			final float op1 = Float.parseFloat(w1);
			final float op2 = Float.parseFloat(w3);
			int check = 0;
			if (w2.equals("+")) {
				res = op1 + op2;
				check = 1;
			} else if (w2.equals("-")) {
				res = op1 - op2;
				check = 1;
			} else if (w2.equals("*")) {
				res = op1 * op2;
				check = 1;
			} else if (w2.equals("/")) {
				if (op2 == 0.0) {
					tf.setText("Math Error");
				} else {
					res = op1 / op2;
					check = 1;
				}
			} else {
				tf.setText("Error!");
			}
			if (check == 0) {
				tf.setText("An Error Occured");

			} else {
				final String ress = Float.toString(res);
				tf.setText(ress);
			}
		}
	}

	public static void main(final String args[]) {
		final AWT_Calculator calculate = new AWT_Calculator();
	}
}
