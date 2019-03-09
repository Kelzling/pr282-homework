package nz.ac.ara.kev38.exercises;

class Controller11 extends Controller {
	private Product1ToN myModel = new Product1ToN();
	
	public Controller11 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		int product = this.myModel.product1ToN();
		
		this.myView.say("The product of all numbers 1 to 10 is " + product);
		
		for (int i = 11; i <= 14; i++) {
			this.myModel.setMaxValue(i);
			this.myView.say("The product of all numbers 1 to " + i + " is " + this.myModel.product1ToN());
		}
	}
}