import java.util.Scanner;
class lab3p4{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		lab3p4 l = new lab3p4();
		lab3p4 l1 = new lab3p4(a);
		lab3p4 l2 = new lab3p4(b);
		lab3p4 l3 = new lab3p4(a,b);
		}
		lab3p4(){
			System.out.println("constructor without params");
			}
		lab3p4(int x){
			System.out.println("constructor with int params:"+x);
		}
		lab3p4(String s){
			System.out.println("constructor with string params:"+s);
			}
		lab3p4(int x,String s){
			System.out.println("constructor with two params int and String:"+x+" "+s);
		}
	}