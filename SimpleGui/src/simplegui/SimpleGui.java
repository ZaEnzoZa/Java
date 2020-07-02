/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Enzo
 */
public class SimpleGui{
    private final String name;
    
    public SimpleGui(String name) {
    this.name = name;
  }
    
    public void initializeGUI() {
    JFrame frame = new JFrame(name);
    JPanel pane = new JPanel();
    JButton button = new JButton("Press");
    JButton quitbutton = new JButton("QUIT");
    JLabel label = new JLabel(" ");
    
    pane.setLayout(new BorderLayout());
    pane.add(button, BorderLayout.SOUTH);
    pane.add(quitbutton, BorderLayout.NORTH);
    pane.add(label, BorderLayout.CENTER);
    
    button.addActionListener((ActionEvent e) -> {
        label.setText("Hello!");
    });
    quitbutton.addActionListener((ActionEvent e) -> {
        System.out.println(Thread.currentThread().getPriority());
        System.exit(0);
    });
    frame.getContentPane().add(pane, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }

    public static void main(String[] args) {
        SimpleGui g = new SimpleGui("A GUI!");
    g.initializeGUI();
    }
    
}
