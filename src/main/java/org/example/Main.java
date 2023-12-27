package org.example;


import processing.core.PApplet;

public class Main  extends PApplet {

    public static final int WIDTH = 720;
    public static final int HEIGHT = 1080;
    public static final int DIAMETER = 100;

    public static void main(String[] args) {

//        System.out.println("Hello world!");
        PApplet.main("org.example.Main",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        getBackground();
        drawCircle();
    }

    private void drawCircle() {
        ellipse(mouseX,mouseY, DIAMETER,DIAMETER);
    }

    private void getBackground() {
        background(255);
    }
}