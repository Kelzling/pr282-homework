package nz.ac.ara.kev38.exercises;

class Controller12 extends Controller {
	private HarmonicSum myModel = new HarmonicSum();
	
	public Controller12 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.myView.say("The harmonic calculated left-to-right is " + this.myModel.sumLeftToRight());
		this.myView.say("The harmonic calculated right-to-left is " + this.myModel.sumRightToLeft());
	}
}