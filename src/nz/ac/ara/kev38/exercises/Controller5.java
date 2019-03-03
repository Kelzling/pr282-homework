package nz.ac.ara.kev38.exercises;

// exercise controller extends provided controller
class Controller5 extends Controller {
	// builds an instance of the model
	private SumAndAverage2 myModel = new SumAndAverage2(100);
	
	public Controller5 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.myModel.calculateValues();
		// uses console view for output
		this.myView.say("The sum is " + this.myModel.getSum());
		this.myView.say("The average is " + this.myModel.getAverage());
	}
}