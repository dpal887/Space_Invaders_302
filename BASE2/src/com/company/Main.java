/** Use this as the screen function when implementing design*/

package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {


    static int playerSpeed = 1;
    public static void main(String[] args) throws InterruptedException {

        int speed = 100;
        final UpgradeScreen uScreen = new UpgradeScreen();
        final BallMoves gScreen = new BallMoves();

        // Initialise the JFrame to hold game Interface
        JFrame boundary = new JFrame("Space Invaders r0.0.8");

        //Create new gamescreen TODO: DEMO ONLY
        boundary.setSize(600, 800);
        boundary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boundary.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                char ch = e.getKeyChar();
                if (ch == 'd') {
                    gScreen.moveBallRight(Main.playerSpeed);
                }
                if (ch == 'a') {
                    gScreen.moveBallLeft(Main.playerSpeed);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        boundary.add(uScreen);
        uScreen.Bound();
        boundary.setVisible(true);

        while (true){
            boundary.add(uScreen);
            uScreen.Bound();
            boundary.setVisible(true);
            for(int j = 0; j<2000; j++) {
                uScreen.repaint();
                Thread.sleep(100 / speed);
                System.out.print(Integer.toString(j));
                System.out.println(": Initial");
            }
            boundary.setVisible(false);
            boundary.remove(uScreen);
            boundary.add(gScreen);
            boundary.setVisible(true);
            for(int j = 0; j<20000; j++) {
                gScreen.repaint();
                Thread.sleep(100 / speed);
                System.out.print(Integer.toString(j));
                System.out.println(": Game");
            }
            boundary.setVisible(false);
            boundary.remove(gScreen);
        }

    }


}
