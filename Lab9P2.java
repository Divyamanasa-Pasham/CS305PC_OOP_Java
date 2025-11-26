import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Lab9P2 extends JFrame{
	Label l;
	Lab9P2(){
		super("JTable Demo");
		String[] heading = {"NAME" , "COURSE" , "ROLLNO" };
		String[] [] data = {
					{"DELL" , "CSE" , "824747"},
					{"HP" , "CSD" , "901427"},
					{"LENOVO" , "CSM" , "950216"},
					{"ACER" , "CSO" , "970060"},
		};
		JTable jt = new Jtable(data, heading);
		JscrollPane jsp = new JScrollPane(jt);
		
		add(jsp);
		setVisible(true);
		setSize(500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String...args){
			new Lab9P2();
		}
	}

