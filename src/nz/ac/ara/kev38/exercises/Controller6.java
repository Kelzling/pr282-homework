package nz.ac.ara.kev38.exercises;

class Controller6 extends Controller {
	private Exercise6 ex6 = new Exercise6(100);
	
	public Controller6 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.ex6.calculateValues();
		this.myView.say("The sum is " + this.ex6.getSum());
		this.myView.say("The average is " + this.ex6.getAverage());
	}
}