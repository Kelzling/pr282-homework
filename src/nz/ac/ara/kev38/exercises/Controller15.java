package nz.ac.ara.kev38.exercises;

class Controller15 extends Controller {
	private Tribonacci myModel = new Tribonacci(20);
	
	public Controller15 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		this.myView.say("The first 20 tribonacci numbers are:");
		int[] nums = this.myModel.getTribonacciNumbers();
		String output = "";
		for (int num : nums) {
			output += num + " ";
		}
		this.myView.say(output);
		this.myView.say("The average is " + this.myModel.getAverage());
	}
}