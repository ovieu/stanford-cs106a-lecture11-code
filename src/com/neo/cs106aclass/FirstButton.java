package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FirstButton extends ConsoleProgram{
    public static void main(String[] args) {
        new FirstButton().start(args);
    }

    public void init() {
        setFont("Courier-24");

        add(new JButton("Hi"), SOUTH);
        addActionListeners();
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Hi")) {
            println("Hello there");
        }
    }
}
