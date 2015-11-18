package com.denis.kurs;

import com.denis.kurs.Visual.VI_1;
import com.denis.kurs.Visual.VisualInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Created by Denis on 25.10.2015.
 */
public class Main {

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("StohProg kurs");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 300);
        mainFrame.setResizable(false);
        mainFrame.setLocation(600, 200);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New file"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.addSeparator();

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exit);

        JMenu editMenu = new JMenu("Settings");
        JMenu pasteMenu = new JMenu("Type");
        pasteMenu.add(new JMenuItem("Original"));
        pasteMenu.add(new JMenuItem("Interval"));
        JMenu helpMenu = new JMenu("Help");
        editMenu.add(pasteMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        menuBar.add(Box.createHorizontalGlue());
        mainFrame.setJMenuBar(menuBar);
        menuBar.setBackground(Color.lightGray);
        menuBar.setBorderPainted(true);
        mainFrame.getRootPane().setJMenuBar(menuBar);
        mainFrame.setResizable(false);

        VisualInterface visualInterface = new VI_1();
        mainFrame.add(visualInterface);

        mainFrame.setVisible(true);
    }

}
