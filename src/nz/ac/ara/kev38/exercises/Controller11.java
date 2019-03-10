package nz.ac.ara.kev38.exercises;

import java.util.List;

class Controller11 extends Controller {
	private Product1ToN myModel;
	
	public Controller11 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		String input = this.myView.get("Input the max value to calculate to:");
		int maxValue = Integer.parseInt(input);
		this.myModel = new Product1ToN(maxValue);
		int product = this.myModel.product1ToN();
		
		this.myView.say("The product of all numbers 1 to " + maxValue + " is " + product);
		
		List<Integer> multipleProducts = this.myModel.multipleProducts(11, 14);
		String output = "The products between 11 and 14 are ";
		for (int i = 0; i < multipleProducts.size(); i++) {
			output += multipleProducts.get(i);
			if (i < multipleProducts.size() - 1) {
				output += ", ";
			}
		}
		
		this.myView.say(output);
	}
}