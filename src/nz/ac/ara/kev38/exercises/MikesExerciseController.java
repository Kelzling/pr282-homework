package nz.ac.ara.kev38.exercises;

import java.io.IOException;

public abstract class MikesExerciseController {
	protected IView myView;
	private String data;
	
	// the VIEW is injected
	public MikesExerciseController(IView theView ){
		this.myView = theView;
	}
	
	// must be implemented differently for each exercise
	abstract protected void doStuff();
	
	// general method so can call many exercises
	public void go() {
		this.myView.start();
		this.doStuff();
		try {
			this.myView.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
