package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TextFieldExample2 extends ConsoleProgram {
    public static void main(String[] args) {
        new TextFieldExample2().start(args);
    }

    public void init() {
        //  setup the new textfield
        nameField = new JTextField(10);

        //  you can name the textfield so you
        //  can refer to it by name
        nameField.setActionCommand("name");

        add(new JLabel("Name"), SOUTH);
        add(nameField, SOUTH);
        nameField.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if ("name".equals(e.getActionCommand())) {
            println("Hello " + nameField.getText());
        }
    }

    /** private instance variables */
    private JTextField nameField;
}
