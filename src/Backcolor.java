/**
 * @(#)Backcolor.java
 *
 * Backcolor application
 *
 * @author 
 * @version 1.00 2015/9/9
 */
 import java.awt.*;
public class Backcolor extends Frame
{
 Label l1,l2,l3;
 Button b1,b2;
 TextField t1,t2,t3;
 String a,b,c;
 int n,p,f;
 Backcolor()
 {
 	b1=new Button("apply");
 	b2=new Button("exit");
 	t1=new TextField(10);
 	t2=new TextField(10);
 	t3=new TextField(10);
 	l1=new Label("red");
 	l2=new Label("green");
 	l3=new Label("blue");
 	setLayout(new FlowLayout());
 	add(l1);
 	add(t1);
 	add(l2);
 	add(t2);
 	add(l3);
 	add(t3);
 	add(b1);
 	add(b2); 
 }
 public boolean action(Event e1,Object o1)
 {
 	if(o1.equals("apply"))
 	{
 		a=t1.getText();
 		b=t2.getText();
 		c=t2.getText();
 		n=Integer.parseInt(a);
 		f=Integer.parseInt(b);
 		p=Integer.parseInt(c);
 		Color c1=new Color(n,f,p);
 		setBackground(c1);
 	}
 	else if(o1.equals("exit"))
 		System.exit(0);
 			return(true);			
 }   
    public static void main(String[] args) {
   Backcolor b1= new Backcolor();
   b1.setSize(400,500);
   b1.setVisible(true);
   b1.setLocation(40,50);
   b1.setResizable(true);
   b1.setTitle("Background color"); 	
    
    }
}
