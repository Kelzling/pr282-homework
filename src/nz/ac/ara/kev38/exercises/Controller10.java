package nz.ac.ara.kev38.exercises;

class Controller10 extends Controller {
	private Exercise10 ex10 = new Exercise10(100);
	
	public Controller10(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		this.ex10.calculateValues();
		this.myView.say("The sum of the squares is " + this.ex10.getSquaresSum());
		this.myView.say("The average of the sum of the squares is " + this.ex10.getSquaresSumAverage());
	}
}