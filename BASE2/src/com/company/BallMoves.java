/** Demo Code Explaining how you can extend the class to create your players movement function So far I have only added x and y so work on that*/

package com.company;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BallMoves extends GameScreen {

    public void moveBallRight(int n) {

        if (x > 510){
            x = x;
        }
        else {
            x = x + (10+n);
        }
    }
    public void moveBallLeft(int n) {

        if (x < 20){
            x = x;
        }
        else {
            x = x - (10+n);
        }
    }
}
