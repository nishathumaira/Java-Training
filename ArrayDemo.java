class ArrayDemo{

	public static void main(String[] args){
	
		// Array Declaration and Instantiation
		int[] scores = new int[3];
		
		
		// Store values into an array using index
		
		scores[0] = 100;
		scores[2] = 200;
		
		
		System.out.println(scores[0]); // 100
		System.out.println(scores[1]); // 0
		System.out.println(scores[2]); // 200
		
		
		
		String[] names = new String[3];
		
		
		
		
		names[0] = "Alex";
		
		names[2] = "Peter";
		
		
		System.out.println(names[0]); // Alex
		System.out.println(names[1]); // null
		System.out.println(names[2]); // 200
		
		
		
		double[] avgs = new double[3];
		
		
		avgs[0] = 10.4;
		avgs[2] = 10.4;
		
		
		
		System.out.println(avgs[0]); // 10.4
		System.out.println(avgs[1]); // 0.0
		System.out.println(avgs[2]); // 10.4
		
		
		
		
		char[] grades = new char[3];
		
		
		grades[0] = 'A';
		grades[2] = 'A';
		
		
		
		System.out.println(grades[0]); // A
		System.out.println(grades[1]); // Blankspace
		System.out.println(grades[2]); // A
		
		
		//String email;
		
		//System.out.println(email); // Error
		
		
		
		
		
	
	}


}