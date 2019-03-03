package nz.ac.ara.kev38.exercises;

// exercise controller extends provided controller
class Controller9 extends Controller {
	// build instance of model
	private SumAndAverage6 myModel = new SumAndAverage6(100);
	
	public Controller9(IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.myModel.calculateValues();
		// uses console view for output
		this.myView.say("The sum is " + this.myModel.getSum());
		this.myView.say("The average is " + this.myModel.getAverage());
		this.myView.say("The count of numbers was " + this.myModel.getCount());
	}
}