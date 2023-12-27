package org.example;

import processing.core.PApplet;

public class Challenge extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 25;
    public int speedOfBallOne= 1;
    public int speedOfBallTwo= 1;
    public int speedOfBallThree= 1;
    public int speedOfBallFour= 1;



    public static void main(String[] args) {
        PApplet.main("org.example.Challenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {

        drawMoveableBall(speedOfBallOne+=1,HEIGHT/5);
        drawMoveableBall(speedOfBallTwo+=2,(HEIGHT/5)*2);
        drawMoveableBall(speedOfBallThree+=3,(HEIGHT/5)*3);
        drawMoveableBall(speedOfBallFour+=4,(HEIGHT/5)*4);
    }

    private void drawMoveableBall(int speed,int heighOfTheBall) {
        ellipse(speed, heighOfTheBall  , DIAMETER, DIAMETER);
    }
}
