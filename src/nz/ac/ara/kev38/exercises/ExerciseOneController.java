package nz.ac.ara.kev38.exercises;

import java.io.IOException;

class Exercise1Controller extends Controller {
	Exercise1 ex1 = new Exercise1();
	
	public Exercise1Controller(IView theView) {
		super(theView);
	}
	
	@Override
	public void go() {
		this.myView.start();
		
		for (int i = 0; i <= 100; i++) {
			this.myView.say("" + i + " = " + ex1.CheckMark(i));
		}
		
		try {
			this.myView.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

