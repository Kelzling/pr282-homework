package nz.ac.ara.kev38.exercises;

class Controller7 extends Controller {
	private Exercise7 ex7 = new Exercise7(111, 8989);
	
	public Controller7(IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.ex7.calculateValues();
		this.myView.say("The sum is " + this.ex7.getSum());
		this.myView.say("The average is " + this.ex7.getAverage());
		this.myView.say("The count of numbers was " + this.ex7.getCount());
	}
}