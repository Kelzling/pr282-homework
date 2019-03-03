package nz.ac.ara.kev38.exercises;

// exercise controller extends provided controller
class Controller7 extends Controller {
	// builds model class
	private SumAndAverage4 myModel = new SumAndAverage4(111, 8989);
	
	public Controller7(IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.myModel.calculateValues();
		// uses consoleview for output
		this.myView.say("The sum is " + this.myModel.getSum());
		this.myView.say("The average is " + this.myModel.getAverage());
		this.myView.say("The count of numbers was " + this.myModel.getCount());
	}
}