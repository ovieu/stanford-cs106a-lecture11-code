package com.neo.cs106aclass;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;


public class BouncingBall2 extends GraphicsProgram{
    private static GOval ball;

    /**	ball's size */
    private static final int BALL_DIAMETER = 30;

    /**	ball's initial position */
    private static final int X_START = BALL_DIAMETER / 2;
    private static final int Y_START = 30;

    /** the animation delay */
    private static final int DELAY = 40;

    /** ball's velocity */
    private double xVel = 5;
    private double yVel = 0.0;

    /** the aceeleration due to gravity */
    private static final int GRAVITY = 3;

    /** the reduction in the bounce due to gravity **/
    private static final double BOUNCE_REDUCE = 0.9;


    public void run() {
        setup();
        while (ball.getX() < getWidth()) {
            moveBall();
            checkForCollision();
            pause(DELAY);
        }
    }

    private void checkForCollision() {
        if (ball.getY() > getHeight() - BALL_DIAMETER) {
            yVel = -yVel * BOUNCE_REDUCE;
            //	add the difference if the ball moves
            //	beyond the screen
            double diff = ball.getY() - (getHeight() - BALL_DIAMETER);
            ball.move(0, -2 * diff);
        }
    }

    private void moveBall() {
        if (ball.getY() < getHeight() - BALL_DIAMETER) {
            yVel += GRAVITY;
            ball.move(xVel, yVel);
        }
    }

    private void setup() {
        ball = new GOval(X_START, Y_START, BALL_DIAMETER, BALL_DIAMETER);
        ball.setFilled(true);
        ball.setColor(Color.RED);
        add(ball);
    }
}
