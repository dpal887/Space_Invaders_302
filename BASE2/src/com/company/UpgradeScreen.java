package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpgradeScreen extends Screen {

    private JButton Speedup = new JButton("Speedup Player");
    private JButton Slowdown = new JButton("Slowdown AI's");
    private JButton FireRateUp = new JButton("Increase Fire Rate");
    private JButton HPUp = new JButton("Increase HP");


    public int upgrade_Player_Speed_multiplier;
    public int upgrade_AI_Speed_Multiplier;

    public void Bound() throws InterruptedException {
        super.add(Speedup);
        super.add(Slowdown);
        super.add(FireRateUp);
        super.add(HPUp);
        Speedup.setBackground(Color.WHITE);
        Speedup.setForeground(Color.BLACK);
        Slowdown.setBackground(Color.WHITE);
        Slowdown.setForeground(Color.BLACK);
        FireRateUp.setBackground(Color.WHITE);
        FireRateUp.setForeground(Color.BLACK);
        HPUp.setBackground(Color.WHITE);
        HPUp.setForeground(Color.BLACK);
        Speedup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("Correct Action Performed");
                Main.playerSpeed = Main.playerSpeed + 1;
                System.out.print(Integer.toString(Main.playerSpeed));
            }
        });

        super.setLayout(new FlowLayout());
    }


    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.setBackground(Color.GREEN);
    }

}
