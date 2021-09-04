package ch20fx;

/*********************************************************************************
 * GameLetterPanel.java
 * Panel class which which uses threads and overwrites the run method
 * to display a panel which has letters that go from the top of the panel
 * to the bottom. The colors are set each iteration to a new color.
 * It is used by GamePanel class
 *********************************************************************************/

import java.awt.*;
import javax.swing.*;


class GameLetterPanel extends JPanel implements Runnable {
	public static Thread letterThread = null;
    private int y = 10;
    static long nLetterDropped = 1;
    RandNum rn = new RandNum();
	int $ranNum = rn.ranNum();
	String $letter = rn.ranNumLetter();
	Color $letterColor= rn.ranNumColor();

/***************************************************************************************
    *  main method in the class for starting and stopping the thread
	************************************************************************************/
    GameLetterPanel()  {
        if (letterThread == null) {
		letterThread = new Thread(this);
		letterThread.start();
			}
  	}

/***************************************************************************************
    *  Creates the thread and uses Thread.sleep to set the speed of the movement
 	************************************************************************************/

    public void run() {
      	Thread myThread = Thread.currentThread();
        while (letterThread == myThread) {
          try{
              Thread.sleep(20);
           }
           catch (InterruptedException e){}
	       repaint();
	        }
	     }

/***************************************************************************************
	* the paint method draws the letter based on color(ranNumLetter), location($ranNum and y)
    * and speed (y += 3 with Thread.sleep from run())
    *************************************************************************************/

     public void paint(Graphics g) {
        g.setFont(new Font("Courier", Font.BOLD+Font.ITALIC, 48));
        g.setColor(Color.white);
        g.drawString($letter, $ranNum, y);
        y += 3;
        Dimension d = getSize();
        if (y > (d.width - 10))
           {y = 10;
           GameLetterPanel.nLetterDropped +=1;
           $ranNum = rn.ranNum();
           this.$letter = rn.ranNumLetter();
	   	   this.$letterColor = rn.ranNumColor();
           }

       	g.setFont(new Font("Courier", Font.BOLD+Font.ITALIC, 48));
        g.setColor($letterColor);
        g.drawString($letter, $ranNum, y);
     }

/***************************************************************************************
    *  sets thread to null which stops the thread
	************************************************************************************/
     public static void stop() {
        letterThread = null;
		}

/***************************************************************************************
    *  Returns the random letter when called
	************************************************************************************/
	public String getLetter() {
		return this.$letter;
	}
  }