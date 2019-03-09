package nz.ac.ara.kev38.exercises;

class Controller14 extends Controller {
	private Fibonacci myModel = new Fibonacci(20);
	
	public Controller14 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.myView.say("The first 20 fibonacci numbers are:");
		int[] nums = this.myModel.getFibonacciNumbers();
		String output = "";
		for (int num : nums) {
			output += num + " ";
		}
		this.myView.say(output);
		this.myView.say("The average is " + this.myModel.getAverage());
	}
}