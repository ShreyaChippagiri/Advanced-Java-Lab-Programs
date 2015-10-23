import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Calculator extends JFrame implements ActionListener
{
int c,n;
String s1,s2,s3,s4,s5;
Frame f;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
Panel p;
TextField tf1;
GridLayout gl;
Calculator()
{
f=new Frame("Calculator");
p=new Panel();
b1=new JButton("0");
b1.addActionListener(this);
b2=new JButton("1");
b2.addActionListener(this);
b3=new JButton("2");
b3.addActionListener(this);
b4=new JButton("3");
b4.addActionListener(this);
b5=new JButton("4");
b5.addActionListener(this);
b6=new JButton("5");
b6.addActionListener(this);
b7=new JButton("6");
b7.addActionListener(this);
b8=new JButton("7");
b8.addActionListener(this);
b9=new JButton("8");
b9.addActionListener(this);
b10=new JButton("9");
b10.addActionListener(this);
b11=new JButton("+");
b11.addActionListener(this);
b12=new JButton("-");
b12.addActionListener(this);
b13=new JButton("x");
b13.addActionListener(this);
b14=new JButton("/");
b14.addActionListener(this);
b15=new JButton("=");
b15.addActionListener(this);
b16=new JButton("A/C");
b16.addActionListener(this);
tf1=new TextField(20);
p.add(tf1);
tf1.setBackground(Color.yellow);
gl=new GridLayout(4,4,10,20);
p.setLayout(gl);
p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(b10);p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(b16);
f.add(p);
f.setSize(100,200);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
s3=tf1.getText();
s4="0";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b2)
{
s3=tf1.getText();
s4="1";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b3)
{
s3=tf1.getText();
s4="2";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b4)
{
s3=tf1.getText();
s4="3";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b5)
{
s3=tf1.getText();
s4="4";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b6)
{
s3=tf1.getText();
s4="5";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b7)
{
s3=tf1.getText();
s4="6";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b8)
{
s3=tf1.getText();
s4="7";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b9)
{
s3=tf1.getText();
s4="8";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b10)
{
s3=tf1.getText();
s4="9";
s5=s3+s4;
tf1.setText(s5);
}
if(e.getSource()==b11)
{
s1=tf1.getText();
tf1.setText("");
c=1;
}
if(e.getSource()==b12)
{
s1=tf1.getText();
tf1.setText("");
c=2;
}
if(e.getSource()==b13)
{
s1=tf1.getText();
tf1.setText("");
c=3;
}
if(e.getSource()==b14)
{
s1=tf1.getText();
tf1.setText("");
c=4;
}
if(e.getSource()==b15)
{
s2=tf1.getText();
if(c==1)
{
n=Integer.parseInt(s1)+Integer.parseInt(s2);
tf1.setText(String.valueOf(n));
}
else
if(c==2)
{
n=Integer.parseInt(s1)-Integer.parseInt(s2);
tf1.setText(String.valueOf(n));
}
else
if(c==3)
{
n=Integer.parseInt(s1)*Integer.parseInt(s2);
tf1.setText(String.valueOf(n));
}
else
if(c==4)
{
n=Integer.parseInt(s1)/Integer.parseInt(s2);
tf1.setText(String.valueOf(n));
}
}
if(e.getSource()==b16)
{
tf1.setText("");
}

}

 public static void main(String args[])
{
      Calculator c=new Calculator();
      c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    c.setVisible(true);

	  
	  // Menu app = new Menu();
		//app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


 }
} 















