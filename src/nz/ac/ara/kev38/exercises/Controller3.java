package nz.ac.ara.kev38.exercises;

// exercise controller extends provided controller
class Controller3 extends Controller {
	// creates an instance of the model
	private PrintWord myModel = new PrintWord();
	
	public Controller3(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		for (int i = 0; i <= 10; i++) {
			// uses consoleview for output
			this.myView.say("" + i + " = " + this.myModel.printWordA(i));
			
			this.myView.say("" + i + " = " + this.myModel.printWordB(i));
		}
	}
}