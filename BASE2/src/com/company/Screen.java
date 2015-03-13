package com.company;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screen extends JPanel {

    public void Bound() throws InterruptedException {
        Screen game = new Screen();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.setBackground(Color.BLUE);
        g2.setColor(Color.WHITE);
    }

}
