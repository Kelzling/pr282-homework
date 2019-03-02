package nz.ac.ara.kev38.exercises;

class Controller2 extends Controller {
	private Exercise2 ex2 = new Exercise2();
	
	public Controller2(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		for (int i = 0; i <= 100; i++) {
			this.myView.say("" + i + " = " + this.ex2.checkNumber(i));
		}
	}
}