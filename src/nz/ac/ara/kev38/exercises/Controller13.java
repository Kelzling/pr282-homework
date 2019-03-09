package nz.ac.ara.kev38.exercises;

class Controller13 extends Controller {
	private ComputePI myModel = new ComputePI();
	
	public Controller13 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		Double calculatedPI = this.myModel.computePI(20000); 
		this.myView.say("Calculated PI: " + calculatedPI);
		Double percentDifference = this.myModel.comparePI(calculatedPI);
		this.myView.say("The percentage difference from Math.PI is " + percentDifference + "%");
	}
}