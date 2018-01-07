package com.neo.cs106aclass;

import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

public class ClickForFace extends GraphicsProgram {
    /*  Private constant */
    private static final int FACE_DIAM = 30;

    //  Note: this program has no run method

    public void init() {
        addMouseListeners();
    }

    public void mouseClicked(MouseEvent e) {
        GFace face = new GFace(FACE_DIAM, FACE_DIAM);
        add(face, e.getX(), e.getY());
    }
}
