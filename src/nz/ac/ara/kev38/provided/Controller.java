package nz.ac.ara.kev38.provided;

import java.io.IOException;
import nz.ac.ara.kev38.exercises.*;

public class Controller {

    protected IView myView;

    private String data;

    public Controller(IView theView){

         this.myView = theView;

    }

    public void go() {

         this.myView.start();

         data = this.myView.get();

         this.myView.say(this.data);

         try {

             this.myView.stop();

         } catch (IOException e) {

             e.printStackTrace();

         }

    }
}