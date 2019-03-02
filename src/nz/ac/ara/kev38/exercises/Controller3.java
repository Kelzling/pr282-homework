package nz.ac.ara.kev38.exercises;

class Controller3 extends Controller {
	private Exercise3 ex3 = new Exercise3();
	
	public Controller3(IView theView) {
		super(theView);
	}
	
	@Override
	public void doStuff() {
		for (int i = 0; i <= 10; i++) {
			this.myView.say("" + i + " = " + this.ex3.printWordA(i));
			
			this.myView.say("" + i + " = " + this.ex3.printWordB(i));
		}
	}
}