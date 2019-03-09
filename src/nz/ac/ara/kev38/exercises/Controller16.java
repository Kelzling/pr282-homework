package nz.ac.ara.kev38.exercises;

class Controller16 extends Controller {
	private ReverseString myModel = new ReverseString();
	
	public Controller16 (IView theView) {
		super(theView);
	}
	
	public void doStuff() {
		String input = this.myView.get("Enter a String:");
		String reversed = this.myModel.reverseString(input);
		this.myView.say("The reverse of string \"" + input + "\" is \"" + reversed + "\"");
	}
}