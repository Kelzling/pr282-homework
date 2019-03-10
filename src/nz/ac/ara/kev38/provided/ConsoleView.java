package nz.ac.ara.kev38.provided;

import java.io.IOException;

import java.util.Scanner;
import nz.ac.ara.kev38.exercises.*; 

public class ConsoleView implements IView {

    @Override

    public String get() {

         String input;

         System.out.println(">");

         Scanner s = new Scanner(System.in);

         input = s.nextLine();

        //  s.close();

         return input;

    }
    
    @Override
    public String get(String message) {
    	String input;
    	System.out.println("> " + message);
    	System.out.println(">");
    	
    	Scanner s = new Scanner(System.in);
    	
    	input = s.nextLine();
    	
    	// s.close();
    	
    	return input;
    }

    @Override

    public <T> void say(T message) {

         System.out.println(message);

    }

    @Override

    public void start() {

         System.out.println("STARTING");

    }

    @Override

    public void stop() throws IOException {

         System.out.println("press ENTER to exit");

         System.in.read();

         System.out.println("bye!");
         
         

    }

}