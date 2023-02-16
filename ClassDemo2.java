class Pioneer{ // Upper-camel

	int pioneerId; // Lower-camel case

	String pioneerName;
	
	
	// Setter Methods & Getter Methods
	
	/*
	  Setter methods must not have any return type (except void)
	  
	  Setter methods should have at least one parameter
	  
	*/
	
	
	void setPioneerId(int id){
		
		pioneerId = id;
	}
	
	
	void setPioneerName(String name){
		
		pioneerName = name;
	
	}
	
	
	/*
	
		Getter methods always return a value back to the caller, it means there should 
			be a corresponding return type (other than void)
			
		Getter methods must not take any parameters	
			
	
	*/
	
	int getPioneerId(){
	
	  return pioneerId;
	}
	
	
	String getPioneerName(){
		
		return pioneerName;
	}
	

}//End of Pioneer class


class ClassDemo2{

	public static void main(String[] args){
	
		// Create object(s) from Pioneer class
		
		Pioneer p1 = new Pioneer();
		
		// Set values into Pioneer object
		
		p1.setPioneerId(1);
		p1.setPioneerName("Tom");
		
		
		//  Display object values
		System.out.println(p1.getPioneerId());
		System.out.println(p1.getPioneerName());
		
		
		
		System.out.println("*************************");

		Pioneer p2 = new Pioneer();
		
		
		p2.setPioneerId(2);
		p2.setPioneerName("Ruben");
		
		
		//  Display object values
		System.out.println(p2.getPioneerId());
		System.out.println(p2.getPioneerName());
		
		
		
		Pioneer[] pioneers = {p1, p2};
		
		
		
		System.out.println("Number of Pioneers "+pioneers.length);
		
		
		
		/*
			
			Enhanced For Loop / foreach 
			
			
			for(datatype tempVariable : array/collectionName){
				
				
				
			}
				
			
		*/
		
		
		
		for(Pioneer p : pioneers){
			
			System.out.println(p.getPioneerId());
			System.out.println(p.getPioneerName());
		}
		
	    
		
		//p1.pioneerId = -1; // BAD PRACTICE
		
		System.out.println(p1.getPioneerId());
		
		
	}


}