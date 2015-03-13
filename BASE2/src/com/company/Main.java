/** Use this as the screen function when implementing design*/

package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) throws InterruptedException {
        final int speed = 100;

        // Initialise the JFrame to hold game Interface
        JFrame boundary = new JFrame("Space Invaders r0.0.8");

        //Create new gamescreen TODO: DEMO ONLY
        //When You are using this part of the code modify the BallMoves file or change name of BallMoves below to your new class's name
        final BallMoves gScreen = new BallMoves();
        //Add add type (JPanel) BallMoves() to the screen
        boundary.add(gScreen);
        //
        boundary.setSize(600, 800);
        boundary.setVisible(true);
        boundary.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gScreen.Bound();


        boundary.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                char ch = e.getKeyChar();
                if (ch == 'd') {
                    gScreen.moveBallRight();
                }
                if(ch == 'a') {
                    gScreen.moveBallLeft();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
//        while (true) {
//
//            gScreen.repaint();
//            Thread.sleep(100/speed);
//
//        }
        boundary.remove(gScreen);
        UpgradeScreen uScreen = new UpgradeScreen();
        boundary.add(uScreen);
        uScreen.Bound();
        boundary.setVisible(true);

        while (true) {

            uScreen.repaint();
            Thread.sleep(100/speed);

        }

        //boundary.remove(uScreen);


    }


}
