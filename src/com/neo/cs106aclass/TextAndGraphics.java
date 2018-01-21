package com.neo.cs106aclass;

import acm.graphics.GCanvas;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TextAndGraphics extends ConsoleProgram {
    public static void main(String[] args) {
        new TextAndGraphics().start(args);
    }

    public void init() {
        setLayout(new GridLayout(1, 3));

        //  note console is the first element in our layout

        //  create and add first canvas
        leftCanvas = new GCanvas();
        add(leftCanvas);

        rightCanvas = new GCanvas();
        add(rightCanvas);

        textField = new JTextField(10);
        add(new JLabel("Some text"), SOUTH);
        add(textField, SOUTH);
        textField.addActionListener(this);

        add(new JButton("Draw left"), SOUTH);
        add(new JButton("Draw right"), SOUTH);

        addActionListeners();
    }

    public void actionPerformed(ActionEvent e) {
        if (textField == e.getSource()) {
            println("You typed: " + textField.getText());
        }

        //  get the reference to the buttons using the button
        //  names

        //  create a cmd string to store names of the buttons
        String cmd = e.getActionCommand();

        if (e.getActionCommand().equals("Draw right")) {
            rightCanvas.add(createFilledRect(), 20, leftY);
            leftY += SPACER;
        } else if (e.getActionCommand().equals("Draw left")) {
            leftCanvas.add(createFilledRect(), 20, rightY);
            rightY += SPACER;
        }
    }

    private GRect createFilledRect() {
        GRect rect = new GRect(50, 20);
        rect.setFilled(true);
        return rect;
    }


    /** Constants */
    private static double SPACER = 30;

    /** Private instance variables */
    private GCanvas leftCanvas;
    private GCanvas rightCanvas;
    private JTextField textField;

    private double leftY = 10;
    private double rightY = 10;
}
