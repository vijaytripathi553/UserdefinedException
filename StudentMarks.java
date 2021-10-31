package com.spokentutorial.customexception;

public class StudentMarks {
	
	static int marks;

	public StudentMarks(int marks) {
		super();
		this.marks = marks;
	}
	
	// throws keyword is used to register the exception. Untill and unless you are not registering
	// the exception you can not directly throw an exception else it will give you an error.
	public void validate(int marks) throws InvalidMarkException // Which shows that this method will throw ana exception
	{
		if(marks ==0 || marks>100)
		{
			// throw keyword is used to throw a custom exception
			throw new InvalidMarkException(marks +" is not a valid mark");
		}
		else
			
		{
			System.out.println("Marks are valid");
		}
	}
	
	
	// Main Method
	public static void main(String[] args) {
		StudentMarks sm=new StudentMarks(150);
		
		try {
			sm.validate(marks);
		} catch (InvalidMarkException e) {
			e.printStackTrace();
		}
	}

}
