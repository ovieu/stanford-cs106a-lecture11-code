package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NewFirstButton extends ConsoleProgram {
    public static void main(String[] args) {
        new NewFirstButton().start(args);
    }

    public void init() {

        //  create the new button
        hiButton = new JButton("Hi");
        add(hiButton, SOUTH);
        addActionListeners();
    }

    public void actionPerformed(ActionEvent e) {
        if (hiButton == e.getSource()) {
            println("Hello there");
        }
    }

    /** Private instance variables  */
    private JButton hiButton;
}
