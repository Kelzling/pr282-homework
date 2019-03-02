package nz.ac.ara.kev38.exercises;

class Controller9 extends Controller {
	private Exercise9 ex9 = new Exercise9(100);
	
	public Controller9(IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.ex9.calculateValues();
		this.myView.say("The sum is " + this.ex9.getSum());
		this.myView.say("The average is " + this.ex9.getAverage());
		this.myView.say("The count of numbers was " + this.ex9.getCount());
	}
}