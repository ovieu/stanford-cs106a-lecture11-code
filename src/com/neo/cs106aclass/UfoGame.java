package com.neo.cs106aclass;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.awt.event.MouseEvent;

public class UfoGame extends GraphicsProgram {
    /** ufo dimensions */
    private static final int UFO_WIDTH = 40;
    private static final int UFO_HEIGTH = UFO_WIDTH / 2;
    private static final int UFO_SPEED = 5;

    /** bullet data */
    private static final int BULLET_SPEED = 10;
    private static final int BULLET_DIAM = 5;

    /** the animation delay */
    private static final int DELAY = 10;


    public void run() {
        setup();
        while (!gameOver()) {
            moveUfo();
            moveBullet();
            checkForCollisions();
            pause(DELAY);
        }
    }

    /** determines if the game is over
        game is over if ufo is destroyed or
        if the ufo lands on the bottom of the screen  */
    private boolean gameOver() {
        return (ufo == null) ||
                (ufo.getY() >= getHeight() - UFO_HEIGTH);
    }

    /**
     * moves ufo, if ufo has moved to the edge
     * of the screen, moves ufo down and changes
     * ufo direction
     */
    private void moveUfo() {
        if (ufoToLeft) {
            ufo.move(-UFO_SPEED, 0);
            if (ufo.getX() <= 0) {
                ufoToLeft = false;
                ufo.move(0, UFO_HEIGTH);
            }
        } else {
            ufo.move(UFO_SPEED, 0);
            if (ufo.getX() >= getWidth() - UFO_WIDTH) {
                ufoToLeft = true;
                ufo.move(0, UFO_HEIGTH);
            }
        }
    }

    /** moves the bullet */
    private void moveBullet() {
        if (bullet != null) {
            bullet.move(0, -BULLET_SPEED);
        }
    }

    /** checks for bullet interacting with the world
     *  either hitting the ufo or moving off the screen
     */
    private void checkForCollisions() {
        collideWithUfo();
        moveOffScreen();
    }

    /** determines if bullet has moved off screen,
     *  if it has, removes bullet and set bullet to null
     */
    private void moveOffScreen() {
        if (bullet != null) {
            if (bullet.getY() <= - BULLET_DIAM) {
                remove(bullet);
                bullet = null;
            }
        }
    }

    /** checks to see if ufo and bullet collide,
     *  bullet and ufo are removed and both variables
     *  are set to null
     *  */
    private void collideWithUfo() {
        if (bullet != null) {
            GObject collobj = getElementAt(bullet.getX(), bullet.getY());
            if (collobj == ufo) {
                remove(ufo);
                remove(bullet);
                ufo = null;
                bullet = null;
            }
        }
    }

    /** setup the ufo and add mouse listeners */
    private void setup() {
        ufo = new GRect(UFO_WIDTH, UFO_HEIGTH);
        ufo.setFilled(true);
        ufo.setColor(Color.BLUE);
        add(ufo, getWidth(), 0);
        ufoToLeft = true;
        addMouseListeners();
    }

    /** whenn mouse is clicked create bullet, unless a bullet
     *  already exists
     */
    public void mouseClicked(MouseEvent e) {
        if (bullet == null) {
            bullet = new GOval(BULLET_DIAM, BULLET_DIAM);
            bullet.setFilled(true);
            bullet.setFillColor(Color.RED);
            add(bullet, (getWidth() - BULLET_DIAM) / 2,
                    getHeight() - bullet.getHeight());
        }
    }

    /** the private instance variables */
    private GOval bullet;
    private GRect ufo;
    private boolean ufoToLeft;
}
