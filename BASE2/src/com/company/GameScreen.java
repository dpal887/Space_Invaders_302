package com.company;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen extends Screen{

    public int y = 750;
    public int x = 270;

    public void Bound() throws InterruptedException {
        GameScreen game = new GameScreen();
    }


    public void moveBall(){
        x = x+1;
        y = y+1;

    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color DARK_YELLOW = new Color(100,100,0);
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(0, 0, 600, 800);
        g2.setColor(DARK_YELLOW);
        g2.fillRect(0, 0, 600, 50);
        g2.setColor(Color.cyan);
        g2.drawString("Score:",10,30);
        g2.drawString("Lives:",200,30);
        //TODO:DEBUG ONLY
        g2.drawString("DEBUG MODE",300,30);
        g2.drawString("x:",400,20);
        g2.drawString("y:",400,40);
        //TODO: RESUME STANDARD CODE
        g2.drawString(Integer.toString(x),420,20);
        g2.drawString(Integer.toString(y),420,40);
        g2.fillRect(x, y, 60, 10);
        g2.fillRect(x + 20,y - 10,20,20);

    }


}
