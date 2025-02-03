import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calculator extends Applet implements ActionListener
{
 String s,s1,s2,s3,s4;
 int flag=0;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
 Button sum,sub,eq,cl,mul,div;
 TextField t1,t2;
 int a,b,c;
 Font f1;
 public void init()
 {      
	f1 = new Font("Arial",Font.BOLD,30);
	setLayout(null);
	Panel p1 = new Panel();
	p1.setLayout(new GridLayout(4,4));
	Panel p2 = new Panel(); 
 	p2.setLayout(new GridLayout(1,2)); 
  	b1=new Button("1");
  	b2=new Button("2");
  	b3=new Button("3");
  	b4=new Button("4");
  	b5=new Button("5");
  	b6=new Button("6");
  	b7=new Button("7");
  	b8=new Button("8");
  	b9=new Button("9");
  	b0=new Button("0");
  	sum=new Button("+");
  	sub=new Button("-");
  	mul=new Button("*");
  	div=new Button("/");
  	eq=new Button("=");
  	cl=new Button("Clear");
	t1=new TextField(10);
  	t2=new TextField(10);
  	p1.add(b1);
  	p1.add(b2);
  	p1.add(b3);
	p1.add(sum);
  	p1.add(b4);
  	p1.add(b5);
  	p1.add(b6);
	p1.add(sub);
  	p1.add(b7);
  	p1.add(b8);
 	p1.add(b9);
	p1.add(mul);
	p1.add(cl);
  	p1.add(b0);
  	p1.add(eq);
  	p1.add(div);
  	b1.addActionListener(this);
  	b2.addActionListener(this);
  	b3.addActionListener(this);
  	b4.addActionListener(this);
  	b5.addActionListener(this);
  	b6.addActionListener(this);
  	b7.addActionListener(this);
  	b8.addActionListener(this);
  	b9.addActionListener(this);
  	b0.addActionListener(this);
  	sum.addActionListener(this);
  	sub.addActionListener(this);
  	mul.addActionListener(this);
  	div.addActionListener(this);
  	eq.addActionListener(this);
  	cl.addActionListener(this);
	p2.add(t1);
  	p2.add(t2);
	p1.setBounds(0,160,2000,400);
  	p2.setBounds(0,0,2000,150);
	add(p2);
	add(p1);
  	paint();
  }
 public void paint()
 {
  	setBackground(Color.white);
	setFont(f1);
  	b1.setBackground(Color.lightGray);
  	b2.setBackground(Color.lightGray);
  	b3.setBackground(Color.lightGray);
  	b4.setBackground(Color.lightGray);
  	b5.setBackground(Color.lightGray);
  	b6.setBackground(Color.lightGray);
  	b7.setBackground(Color.lightGray);
  	b8.setBackground(Color.lightGray);
  	b9.setBackground(Color.lightGray);
  	b0.setBackground(Color.lightGray);
  	sum.setBackground(Color.lightGray);
  	sub.setBackground(Color.lightGray);
  	mul.setBackground(Color.lightGray);
  	div.setBackground(Color.lightGray);
  	eq.setBackground(Color.lightGray);
  	cl.setBackground(Color.lightGray);
 }
 public void actionPerformed(ActionEvent e)
 {
  	s=e.getActionCommand();
	if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9"))
 	 {
  		if(flag==1){
			t1.setText("");
			t2.setText("");
			s1=t2.getText()+s;
			t2.setText(s1);
			t1.setText(s1);
			s2=s3=s4=null;
			flag=0;			
			}
		else{	 
		 	s1=t2.getText()+s;
  		 	t2.setText(s1);
   		 	if(s2!=null && s3!=null)
   				t1.setText(s2+""+s3+""+s1);
   			 else
   				t1.setText(s1);
			}
  	}
  	if(s.equals("+") && s1!=null && (s3==null||flag==1))
  	{
    		s2=t2.getText();
    		t2.setText("");
    		t1.setText(s1+"+");
    		s3="+";
   		flag=0;
  	}
  	if(s.equals("-") && s1!=null && (s3==null||flag==1))
  	{
    		s2=t2.getText();
    		t2.setText("");
    		t1.setText(s1+"-");
    		s3="-";
 		flag=0;
	}
  	if(s.equals("/") && s1!=null && (s3==null||flag==1))
  	{
    		s2=t2.getText();
    		t2.setText("");
    		t1.setText(s1+"/");
    		s3="/";
   		flag=0;
  	}
  	if(s.equals("*")&& s1!=null &&(s3==null||flag==1))
  	{
    		s2=t2.getText();
    		t2.setText("");
    		t1.setText(s1+"*");
    		s3="*";
   		flag=0;
  	}
  	if(s.equals("="))
  	{
   		s4=t2.getText();
   		a=Integer.parseInt(s2);
   		b=Integer.parseInt(s4);
   		flag=1;
		try{
   		if(s3.equals("+"))
    			c=a+b;
   		if(s3.equals("-"))
    			c=a-b;
    		if(s3.equals("*"))
    			c=a*b;
   		if(s3.equals("/"))
    			c=a/b;
           		t2.setText(String.valueOf(c));
           		t1.setText(s2+""+s3+""+s4);
           		s1=String.valueOf(c);
		}
		catch(ArithmeticException ae)
		{
		JOptionPane.showMessageDialog(null,new String("Arithmetic Exception"+ae));
			t2.setText("");
			t1.setText("");
        		s3=null;
        		s2=null;
        		s4=null;
		} 
  	}
  	if(s.equals("Clear"))
  	{
		t1.setText("");
   		t2.setText("");
   		s1=null;
   		s2=null;
   		s3=null;
  	}
 }

}
/* 
<applet code="calculator.class" width="500" height="500"> 
</applet> 
*/  
