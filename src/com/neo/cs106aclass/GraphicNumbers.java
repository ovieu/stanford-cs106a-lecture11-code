package com.neo.cs106aclass;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import java.util.ArrayList;
import java.awt.event.*;

public class GraphicNumbers extends GraphicsProgram{
    private static final double START_X = 50;
    private static final double START_Y = 100;

    public static void main(String[] args) {
        new GraphicNumbers().start(args);
    }

    public void run() {
        addMouseListeners();
    }

    public void mouseClicked(MouseEvent e) {
        //  create a new label whose text is the
        //  number of elements in the ilist
        GLabel label = new GLabel("#" + labelList.size());

        //  get the size of one row
        double dy = label.getHeight();

        //  move the list down one row
        for (int i = 0; i < labelList.size(); i++) {
            labelList.get(i).move(0, dy);
        }

        //  add the new label to the canvas
        add(label, START_X, START_Y);
        labelList.add(label);
    }

    ArrayList<GLabel> labelList = new ArrayList<>();
}
