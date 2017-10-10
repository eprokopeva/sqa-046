package com.luxoft.sqa;

public class Point {
    double x;
    double y;

    public Point (double x, double y){
        this.x=x;
        this.y=y;
    }

    public double distance (Point p2){
        return Math.sqrt(Math.pow(p2.x - x,2) + Math.pow(p2.y - y,2));
    }
}
