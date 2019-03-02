package nz.ac.ara.kev38.exercises;

import nz.ac.ara.kev38.provided.*;

public class Main {

	public static void main(String[] args) {
		IView view = new ConsoleView();
		
		Controller ex1Controller = new Controller1(view);
		// ex1Controller.go();
		
		Controller ex2Controller = new Controller2(view);
		// ex2Controller.go();
		
		Controller ex3Controller = new Controller3(view);
		// ex3Controller.go();
		
		Controller ex4Controller = new Controller4(view);
		// ex4Controller.go();
		
		Controller ex5Controller = new Controller5(view);
		// ex5Controller.go();
		
		Controller ex6Controller = new Controller6(view);
		// ex6Controller.go();
		
		Controller ex7Controller = new Controller7(view);
		// ex7Controller.go();
		
		Controller ex8Controller = new Controller8(view);
		// ex8Controller.go();
		
		Controller ex9Controller = new Controller9(view);
		// ex9Controller.go();
		
		Controller ex10Controller = new Controller10(view);
		ex10Controller.go();
	}

}
