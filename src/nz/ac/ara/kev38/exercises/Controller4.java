package nz.ac.ara.kev38.exercises;

// exercise controller extends provided controller
class Controller4 extends Controller {
	// builds an instance of the model
	private SumAndAverage myModel = new SumAndAverage(100);
	
	public Controller4(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		this.myModel.calculateValues();
		// uses consoleview for output
		this.myView.say("The sum is " + this.myModel.getSum());
		this.myView.say("The average is " + this.myModel.getAverage());
	}
}