// ClassFinal with Final key extending the class finalVariableAndmethod
public final class ClassFinal extends finalVariableAndMethod {

	// Declaring the Variable type integer
	public int myRemainingLeaves=7;

	//	Overriding method having final key word shows Error
	//	public void Display()
	//	{
	//		System.out.println("Overriding final Method : "  +this.myFinalnum);
	//	}
	
	// this is Final Class cannot create the constructor
	//	public final ClassFinal() {
	//		// this is Final Class cannot create the constructor
	//	}
	//	
	
	// Public method to print the message
	public void DisplayNew()
	{
		//	Displaying the message to user
		System.out.println("My Remainging leaves for the year: "  +this.myRemainingLeaves);
	}
}
