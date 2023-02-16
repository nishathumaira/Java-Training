class Student{
	// private instance variables
	private int studentId;
	private String studentName;
	
	
	public Student(int studentId, String studentName){ // constructor that takes two arguments & sets the instance variables to the values passed as arguments
		
		this.studentId = studentId;
		this.studentName = studentName;
		
	}
	
	@Override // overridden toString() method
	public String toString(){
		return "ID "+this.studentId+"  NAME :  "+this.studentName;
	} // returns a String of the Student object = the student ID & name
	
}
class Test5{
	
	public static void main(String[] args){ // main method
	
		Student s1 = new Student(1, "Nish"); //Student object s1 with studentId set to 1 & a name
		
		System.out.println(s1); // Prints ID 1 NAME: Nish
		System.out.println(s1.toString()); // Prints ID 1 NAME: Nish
	
	}

}
