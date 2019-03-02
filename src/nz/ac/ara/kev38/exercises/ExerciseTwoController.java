package nz.ac.ara.kev38.exercises;

import java.io.IOException;

class Exercise2Controller extends Controller {
	Exercise2 ex2 = new Exercise2();
	
	public Exercise2Controller (IView theView) {
		super(theView);
	}
	
	@Override
	public void go() {
		this.myView.start();
		
		for (int i = 0; i <= 100; i++) {
			this.myView.say("" + i + " = " + ex2.CheckNumber(i));
		}
		
		try {
			this.myView.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}