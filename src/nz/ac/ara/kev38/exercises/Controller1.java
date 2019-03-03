package nz.ac.ara.kev38.exercises;

// exercise controller inherits from Controller class
class Controller1 extends Controller {
	private CheckMark myModel = new CheckMark();
	
	public Controller1(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		for (int i = 0; i <= 100; i++) {
			// using ConsoleView for output
			this.myView.say("" + i + " = " + this.myModel.checkMark(i));
		}
	}
}

