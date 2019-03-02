package nz.ac.ara.kev38.exercises;

import java.io.IOException;

public abstract class Controller {
	IView myView;
	
	public Controller (IView theView) {
		this.myView = theView;
	}
	
	abstract protected void doStuff();
	
	public void go() {
		myView.start();
		this.doStuff();
		try {
			myView.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}