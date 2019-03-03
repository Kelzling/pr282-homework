package nz.ac.ara.kev38.exercises;

// exercise controller extends controller class
class Controller2 extends Controller {
	// creates an instance of the model
	private CheckNumber myModel = new CheckNumber();
	
	public Controller2(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		for (int i = 0; i <= 100; i++) {
			// using ConsoleView for output
			this.myView.say("" + i + " = " + this.myModel.checkNumber(i));
		}
	}
}