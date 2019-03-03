package nz.ac.ara.kev38.exercises;

// exercise controller extends provided controller
class Controller8 extends Controller {
	// builds an instance of the model class
	private SumAndAverage5 myModel = new SumAndAverage5(100);
	
	public Controller8(IView theView) {
		super(theView);
	}
	
	protected void doStuff() {
		this.myModel.calculateValues();
		// uses console view for output
		this.myView.say("The sum is " + this.myModel.getSum());
		this.myView.say("The average is " + this.myModel.getAverage());
		this.myView.say("The count of numbers was " + this.myModel.getCount());
	}
}