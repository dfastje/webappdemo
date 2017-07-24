package com.byelkawolf.webappdemo.services;


import com.byelkawolf.webappdemo.montecarlo.Cartesian2dPoint;
import org.springframework.stereotype.Service;

@Service
public class RestDemoService {

    /**
     * Fibonacci sequence. Written before writing the montecarlo simulation because I was just playing around with
     * Spring boot.
     * @param nthNum
     * @return
     */
    public int fibonacci(int nthNum) {
        int fibLength = Math.max(nthNum+1,2);
        //+1 to length because I want sequence to ignore leading 0
        int[] fibSeq = new int[fibLength];
        fibSeq[0] = 0;
        fibSeq[1] = 1;
        for(int n=2; n<fibLength;n++){
            fibSeq[n] = fibSeq[n-1] + fibSeq[n-2];
        }
        return fibSeq[nthNum];
    }

    /**
     * This method is going to return the area ratio of a square and a circle
     *      where the length of the square's side is equal to the diameter of
     *      the circle
     *
     * @param radius
     * @param numPoints
     * @return
     */
    public double AreaRatio(double radius, int numPoints) {
        if(numPoints<1) {
            numPoints = 1; // FIXME: 7/23/2017 If program is expanded, change how 0 and negative inputs are handled.
        }
        Cartesian2dPoint[] points = new Cartesian2dPoint[numPoints];

        double numInCircle = 0.00;
        for(Cartesian2dPoint point:points){
            point = new Cartesian2dPoint(radius);
            if(point.isInCircle()){
                numInCircle = numInCircle + 1.00;
            }
        }

        return numInCircle/numPoints;
    }

}
