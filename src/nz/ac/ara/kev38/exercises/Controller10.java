package nz.ac.ara.kev38.exercises;

// exercise controller extends provided controller
class Controller10 extends Controller {
	// builds instance of the model
	private SumAndAverage7 myModel = new SumAndAverage7(100);
	
	public Controller10(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		this.myModel.calculateValues();
		// uses console view for output
		this.myView.say("The sum of the squares is " + this.myModel.getSquaresSum());
		this.myView.say("The average of the sum of the squares is " + this.myModel.getSquaresSumAverage());
	}
}