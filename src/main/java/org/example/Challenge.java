package org.example;

import processing.core.PApplet;

public class Challenge extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 25;
    public static final int NoOfBalls = 4;
    public static final int heightOfTheBall = HEIGHT/(NoOfBalls+1);
    Ball[] balls = new Ball[NoOfBalls];
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
        for(int iterator= 0; iterator< balls.length; iterator++){
           balls[iterator] = new Ball(iterator+1, heightOfTheBall *(iterator+1));
        }
    }

    @Override
    public void draw() {
        for (int iterator= 0; iterator< balls.length; iterator++) {
            balls[iterator].drawMoveBall(iterator+1);
        }
    }

    public class Ball{
        int speed;
        int height;
        Ball(int speed,int height){
            this.speed = speed;
            this.height = height;
        }
        public void drawMoveBall(int speedIncrease) {
            ellipse(this.speed+=speedIncrease, this.height  , DIAMETER, DIAMETER);
        }
    }
}
