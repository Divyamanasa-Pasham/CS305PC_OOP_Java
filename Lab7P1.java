import java.awt.event.*;
import java.awt.*;
	class Lab7P1{
		public static void main(String...args){
			final int[] a = {1};
			Frame f = new Frame();
	        	TextField tf = new TextField(20);
	        	Button b = new Button();
	        	b.setLabel("CLICK");
	        	b.setSize(10,30);
	        	Label l = new Label();
	        	l.setPreferredSize(new Dimension(100,200));
	        
	        
	        	f.add(b);
	        	f.add(tf);
	        	f.add(l);
	        	f.setSize(400,400);
	        	f.setVisible(true);
	        	FlowLayout fl = new FlowLayout();
	        	f.setLayout(fl);
	        	b.addActionListener(
	        		new ActionListener(){
	        			public void actionPerformed(ActionEvent ae){
	        			System.out.println("WELCOME");
	        			l.setText(tf.getText()+"-"+a[0]);
	        			a[0]++; 
	        			}
	       		 	}
	    		); 
	    		f.addWindowListener(
	    			new WindowAdapter(){
	    				public void windowClosing(WindowEvent we){
	    				f.dispose();
	    				}
	    				}
	    				);
	    		f.setVisible(true);
	 	} 
	}
