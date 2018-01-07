package com.neo.cs106aclass;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseTracked extends GraphicsProgram {

    public void run() {
        label = new GLabel("");
        label.setFont("Times New Roman-36");
        add(label, getWidth() / 2, getHeight() / 2);

        addMouseListeners();
        addMouseListeners();


    }

    public void mouseMoved(MouseEvent e) {
        label.setLabel("Mouse: (" + e.getX() + "," + e.getX() + ")");
    }

    private GLabel label;
    private Graphics2D graphics2D;
}
