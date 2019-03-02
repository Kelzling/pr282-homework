package nz.ac.ara.kev38.exercises;

class Controller5 extends Controller {
	private Exercise5 ex5 = new Exercise5(100);
	
	public Controller5 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.ex5.calculateValues();
		this.myView.say("The sum is " + this.ex5.getSum());
		this.myView.say("The average is " + this.ex5.getAverage());
	}
}