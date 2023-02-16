class A{
	int x; // Instance variable
	// Instance variables are always bounded with objects

	static int y; // Static variables are known as Class/Shared/Global Variables
	// Static variables are not bounded with objects instead they are bounded with class itself
}
class Test1{
	
	public static void main(String[] args){
		
		A a1 = new A();
		
		A a2 = new A();
		
		a1.x = 1000;
		
		System.out.println(a1.x);// 1000
		
		System.out.println(a2.x); // 0
		
		
		A a3 = a1;
		
		a3.x = 2000;
				
		a1.x = 5000;
		
			
		System.out.println(a2.x);// 0
		
		System.out.println(a3.x); // 5000
		
		System.out.println(a1.x); // 5000
		
		
		
		
		a1.y = 10000; // Avoid access static members using object reference
		
		
		System.out.println(a1.y);// 10000
		
		System.out.println(a2.y); // 10000
		
		
		A.y = 5000; // Embrace accessing static members using class name
		
		System.out.println(A.y);
		
		
		
	}


}