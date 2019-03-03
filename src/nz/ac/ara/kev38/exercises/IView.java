package nz.ac.ara.kev38.exercises;

import java.io.IOException;

// view interface for provided View class
public interface IView {
	// allow the user to input a string
	// prompt is optional
	public String get();
	public String get(String prompt); 
	// display to the user ANYTHING
	public <T> void say(T message);
	// initialize the user interface
	public void start();
	// close down the user interface
	public void stop() throws IOException;
}
