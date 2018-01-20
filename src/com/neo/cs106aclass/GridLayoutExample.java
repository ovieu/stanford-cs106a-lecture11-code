package com.neo.cs106aclass;

import acm.program.Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GridLayoutExample extends Program {
    public static void main(String[] args) {
        new GridLayoutExample().start(args);
    }

    public void init() {
        setLayout(new GridLayout(2, 3));
        add(new JButton("button 1"));
        add(new JButton("button 2"));
        add(new JButton("button 3"));
        add(new JButton("button 4"));
        add(new JButton("button 5"));
        add(new JButton("button 6"));
        addActionListeners();
    }

    public void actionPerformed(ActionEvent e) {

    }
}
