//Class to Demonstrate the Final key use for Variable and Method
public class finalVariableAndMethod {

	//Declare variable with final key will not allow user to modify the value
	public final int myLeaveCount =10;
	
	
	//Declared the Method as Final , so It cannot be overridden
	public final void Display() {
		//Displaying the Total Leave count
		System.out.println("Employee leave count per year : " + myLeaveCount);
	}
}
