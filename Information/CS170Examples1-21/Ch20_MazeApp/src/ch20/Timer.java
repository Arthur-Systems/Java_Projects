package ch20;
import javax.swing.*;
import javax.swing.border.*;
import java.util.GregorianCalendar;
/**
 * This class creates a thread that counts the seconds since its creation
 */
public class Timer extends Thread {
	JLabel jlTimer = new JLabel();  // Creates instance JLabel object
	GregorianCalendar startTime = new GregorianCalendar(); // creates a start time   
	GregorianCalendar currentTime = new GregorianCalendar(); // creates a current time
	int elapsedTime = 0;  //variable for difference between the two
	
	Timer(JLabel jlTimer){
		this.jlTimer = jlTimer;  //point instance object to passed objects memory location
	}
	
	public void run(){
		startTime = new GregorianCalendar(); // set start time
		while (true){ //never ending loop
			currentTime = new GregorianCalendar(); // set current time
			jlTimer.setText(new Integer((int) (currentTime.getTimeInMillis() - startTime.getTimeInMillis())/1000).toString()); //set timer label to current time in seconds (no rounding)
			try{
				Thread.sleep(250);   // sleep for 1/4 of a second
			} catch(InterruptedException e){
				return;              //catch interrupt used to end the timer
			}
		}
	}
}
