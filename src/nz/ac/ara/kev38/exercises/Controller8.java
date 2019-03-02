package nz.ac.ara.kev38.exercises;

class Controller8 extends Controller {
	private Exercise8 ex8 = new Exercise8(100);
	
	public Controller8(IView theView) {
		super(theView);
	}
	
	protected void doStuff() {
		this.ex8.calculateValues();
		this.myView.say("The sum is " + this.ex8.getSum());
		this.myView.say("The average is " + this.ex8.getAverage());
		this.myView.say("The count of numbers was " + this.ex8.getCount());
	}
}