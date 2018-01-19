package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonPressed extends ConsoleProgram{
    public static void main(String[] args) {
        new ButtonPressed().start();
    }

    public void init() {

        add(new JButton("Hello"), NORTH);
        add(new JButton("Cs106a"), SOUTH);
        add(new JButton("BasketWeaving101"), SOUTH);
        addActionListeners();
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch(cmd) {
            case "Hello":
                println("Hello there");
                break;
            case "Cs106a":
                println("Cs106a Rocks!");
                break;
            case "BasketWeaving101":
                println("Not so much!");
                break;
            default:
                break;
        }
    }
}
