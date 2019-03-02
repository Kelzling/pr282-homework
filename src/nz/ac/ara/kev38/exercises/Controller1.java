package nz.ac.ara.kev38.exercises;

class Controller1 extends Controller {
	private Exercise1 ex1 = new Exercise1();
	
	public Controller1(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		for (int i = 0; i <= 100; i++) {
			this.myView.say("" + i + " = " + this.ex1.checkMark(i));
		}
	}
}

