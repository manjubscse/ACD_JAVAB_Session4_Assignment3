// Declared the Main Class extending the final variable and method.
//public class MainClass extends ClassFinal {
public class MainClass extends finalVariableAndMethod {

	// Main Method for class MainClass
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing the main class
		MainClass mnCls =new MainClass();
		//calling the property of super class
		mnCls.Display();
		// initializing the class final which declared as final
		ClassFinal clsFinal =new ClassFinal();
		// calling the class final property using the object of class final
		clsFinal.DisplayNew();
		// Display the result using the final variable find desired output.
		System.out.println("Total applied leaves for the year : " + (mnCls.myLeaveCount- clsFinal.myRemainingLeaves ));

	}

}
