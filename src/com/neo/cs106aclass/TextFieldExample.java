package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TextFieldExample extends ConsoleProgram {
    public static void main(String[] args) {
        new TextFieldExample().start(args);
    }

    public void init() {
        //  setup the new textfield
        nameField = new JTextField(10);
        add(new JLabel("Name"), SOUTH);
        add(nameField, SOUTH);
        nameField.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (nameField == e.getSource()) {
            println("Hello " + nameField.getText());
        }
    }

    /** private instance variables */
    private JTextField nameField;
}
