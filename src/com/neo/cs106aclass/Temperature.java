package com.neo.cs106aclass;

import acm.graphics.GMath;
import acm.gui.IntField;
import acm.gui.TableLayout;
import acm.program.Program;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Temperature extends Program {
    public static void main(String[] args) {
        new Temperature().start(args);
    }

    public void init() {

        //  set the layout of the program to use
        //  table layout
        setLayout(new TableLayout(2, 3));

        //  add the fahrenheit to celsius field
        fahrenField = new IntField(32);
        fahrenField.setActionCommand("F -> C");
        fahrenField.addActionListener(this);

        //  add the celsius to fahrenheit field
        celsiusField = new IntField(0);
        celsiusField.setActionCommand("C -> F");
        celsiusField.addActionListener(this);

        add(new JLabel("Degrees to Fahrenheit"));
        add(fahrenField);
        add(new JButton("F -> C"));

        add(new JLabel("Fahrenheit to Degrees"));
        add(celsiusField);
        add(new JButton("C -> F"));

        //  add action listeners
        addActionListeners();
    }

    /** action to perform on button click  */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("F -> C")) {
            int f = fahrenField.getValue();
            int c = GMath.round((5.0 / 9.0) * (f - 32));
            celsiusField.setValue(c);
        } else if (e.getActionCommand().equals("C -> F")) {
            int c = celsiusField.getValue();
            int f = GMath.round((9.0 / 5.0) * c  + 32);
            fahrenField.setValue(f);
        }
    }

    /** private instance variables */
    private IntField fahrenField;
    private IntField celsiusField;
}
