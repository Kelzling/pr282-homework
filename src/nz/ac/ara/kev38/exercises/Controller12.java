package nz.ac.ara.kev38.exercises;

import java.util.List;

class Controller12 extends Controller {
	private HarmonicSum myModel = new HarmonicSum();
	
	public Controller12 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		int input = Integer.parseInt(this.myView.get("Enter max number for harmonic calculation"));
		List<Double> results = this.myModel.harmonicSum(input);
		this.myView.say("The harmonic sums are " + results.get(0) + " and " + results.get(1));
		this.myView.say("The difference between the two is " + results.get(2));
	}
}