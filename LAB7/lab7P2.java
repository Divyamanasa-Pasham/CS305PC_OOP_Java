import java.awt.event.*;
import java.awt.*;
class Lab7P2 implements ActionListener{ 
			Frame f =new Frame();
			TextField tf = new TextField();
			Button b =new Button();
			Label l = new Label();
			int a=1;
	 Lab7P2(){
			final int[] a = {1};
	        	b.setLabel("CLICK");
	        	b.setSize(10,30);
	        
	        	l.setPreferredSize(new Dimension(200,200));
	        
	        
	        	f.add(b);
	        	f.add(tf);
	        	f.add(l);
	        	f.setSize(400,400);
	        	f.setVisible(true);
	        	FlowLayout fl = new FlowLayout();
	        	f.setLayout(fl);
	        	b.addActionListener(this);
	    		f.addWindowListener(
	    		new WindowAdapter(){
	    				public void windowClosing(WindowEvent we){
	    				f.dispose();
	    				}
	    				}
	    			
	    		);
	   		
	    		f.setVisible(true);
	 	}
	 	
	        			public void actionPerformed(ActionEvent ae){
	        			System.out.println("WELCOME");
	        			l.setText(tf.getText()+"-"+a);
	        			a++; 
	        			}
	        			public static void main(String...args){
	        			     Lab7P2 p = new Lab7P2();
	        			}
	        			
	        			
	}