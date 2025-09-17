class lab3p3{
	public static void main(String...args){
		lab3p3 mol = new lab3p3();
		mol.display();
		mol.display(10,"Ten");
		mol.display("Two");
		}
		public void display(){
			System.out.println("Method without params");
			}
		public void display(int x,String y){
			System.out.println("Method with int params:"+x+","+y);
		}
		public void display(String y){
			System.out.println("Method overloading3"+y);
			
		}
	}

