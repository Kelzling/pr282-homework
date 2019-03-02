package nz.ac.ara.kev38.exercises;

class Controller4 extends Controller {
	private Exercise4 ex4 = new Exercise4(100);
	
	public Controller4(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		this.ex4.calculateValues();
		this.myView.say("The sum is " + this.ex4.getSum());
		this.myView.say("The average is " + this.ex4.getAverage());
	}
}