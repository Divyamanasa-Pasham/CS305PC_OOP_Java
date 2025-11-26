import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class Lab9P3 extends JFrame{
	Label l;
	Lab9P3(){
	super("JTree Demo");
	DefaultMutabletreeNode root = new DefaultMutableTreeNode("Fruits");
	DefaultMutabletreeNode root = new DefaultMutableTreeNode("Apples");
		apple.add(new DefaultMUtableTreeNode("Red Apple"));
		apple.add(new DefaultMUtableTreeNode("Green Apple"));
		root.add(apple);
		DefaultMutabletreeNode root = new DefaultMutableTreeNode("SoftDrinks");
		sd.add(new DefaultMUtableTreeNode("Pepsi"));
		sd.add(new DefaultMUtableTreeNode("coke"));
		root.add(sd);
		JTree jt = new JTree();
		
		setVisible(true);
		setSize(500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String...args){
			new Lab9P2();
		}
	}
