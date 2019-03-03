package nz.ac.ara.kev38.exercises;

// exercise controller extends provided controller
class Controller6 extends Controller {
	// creates an instance of the model class
	private SumAndAverage3 myModel = new SumAndAverage3(100);
	
	public Controller6 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.myModel.calculateValues();
		// uses consoleview for output
		this.myView.say("The sum is " + this.myModel.getSum());
		this.myView.say("The average is " + this.myModel.getAverage());
	}
}