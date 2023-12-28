package org.example;

import processing.core.PApplet;

public class Challenge extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int heightOfTheBall = HEIGHT / 5;
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
        drawMoveableBall(speedOfBallOne+=1, heightOfTheBall);
        drawMoveableBall(speedOfBallTwo+=2,(heightOfTheBall)*2);
        drawMoveableBall(speedOfBallThree+=3,(heightOfTheBall)*3);
        drawMoveableBall(speedOfBallFour+=4,(heightOfTheBall)*4);
    }

    private void drawMoveableBall(int speed,int height) {
        ellipse(speed, height  , DIAMETER, DIAMETER);
    }
}
