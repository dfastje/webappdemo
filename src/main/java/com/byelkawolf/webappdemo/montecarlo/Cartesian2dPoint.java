package com.byelkawolf.webappdemo.montecarlo;

/**
 * Data type for the points in a montecarlo simulation
 *
 * Cartesian datapoint with an additional method to check if the point is within a circle of the given
 *      radius (this implies a comparison between a square of side length = 2*radius and the circle).
 *
 * If the program is expanded, it will need an abstract "Point" class to accommodate other coordinate systems.
 */
public class Cartesian2dPoint {
    private final double radius;
    private final double x;
    private final double y;
    private final boolean inCircle;

    public Cartesian2dPoint(double radius) {
        this.radius = radius;
        double[] location = getPoint(radius);
        this.x = location[0];
        this.y = location[1];
        if( ( x*x + y*y ) < ( radius*radius ) ) {
            this.inCircle = true;
        }else{
            this.inCircle = false;
        }
    }

    public static double[] getPoint(double radius) {
        double diameter = radius * 2.00;
        double x = ( Math.random() * diameter ) - radius;
        double y = ( Math.random() * diameter ) - radius;
        //subtract radius because math is easiest with origin of circle at [0,0]
        return new double[]{x,y};
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isInCircle() {
        return inCircle;
    }

}
