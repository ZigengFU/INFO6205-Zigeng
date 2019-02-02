/*
 * Copyright (c) 2017. Phasmid Software
 * Author: Zigeng Fu
 */

package randomwalk;

import java.util.Random;

public class RandomWalk {
    private static final int stepLength = 16;
    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    /**
     * Private method to move the current position, that's to say the drunkard moves
     *
     * @param dx the distance he moves in the x direction
     * @param dy the distance he moves in the y direction
     */
    private void move(int dx, int dy) {
        //accumulate the moves in the x and y directions
        x += dx;
        y += dy;
    }

    /**
     * Perform a random walk of m steps
     *
     * @param n the number of steps the drunkard takes
     */
    public void randomWalk(int n) {
        //n random moves
        for(int i = 0; i < n; i++)
            randomMove();
    }

    /**
     * Private method to generate a random move according to the rules of the situation.
     * That's to say, moves can be (+-1, 0) or (0, +-1).
     */
    private void randomMove() {
        boolean ns = random.nextBoolean();
        int step = random.nextBoolean() ? stepLength : -stepLength;
        move(ns ? step : 0, ns ? 0 : step);
    }

    /**
     * Method to compute the distance from the origin (the lamp-post where the drunkard starts) to his current position.
     *
     * @return the (Euclidean) distance from the origin to the current position.
     */
    public double distance() {
        //calculate the Euclidean distance of the current position from the original point
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    /**
     * Perform multiple random walk experiments, returning the mean distance.
     *
     * @param m the number of steps for each experiment
     * @param n the number of experiments to run
     * @return the mean distance
     */
    public static double randomWalkMulti(int m, int n) {
        double totalDistance = 0;
        for (int i = 0; i < n; i++) {
            RandomWalk walk = new RandomWalk();
            walk.randomWalk(m);
            totalDistance = totalDistance + walk.distance();
        }
        return totalDistance / n;
    }

    public static void main(String[] args) {
        //set the number of experiments to 10000 for a more accurate relationship
        int n = 10000;
        
        //then compute out the data using 5 different m (number of steps)
        //data output 1:
        int m1 = 100;
        double meanDistance1 = randomWalkMulti(m1, n);
        System.out.println(m1 + " steps with each step's length is " + stepLength + ": " + meanDistance1 + " over " + n + " experiments");
        
        //data output 2:
        int m2 = 200;
        double meanDistance2 = randomWalkMulti(m2, n);
        System.out.println(m2 + " steps with each step's length is " + stepLength + ": " + meanDistance2 + " over " + n + " experiments");
        
        //data output 3:
        int m3 = 400;
        double meanDistance3 = randomWalkMulti(m3, n);
        System.out.println(m3 + " steps with each step's length is " + stepLength + ": " + meanDistance3 + " over " + n + " experiments");
        
        //data output 4:
        int m4 = 800;
        double meanDistance4 = randomWalkMulti(m4, n);
        System.out.println(m4 + " steps with each step's length is " + stepLength + ": " + meanDistance4 + " over " + n + " experiments");
        
        //data output 5:
        int m5 = 1600;
        double meanDistance5 = randomWalkMulti(m5, n);
        System.out.println(m5 + " steps with each step's length is " + stepLength + ": " + meanDistance5 + " over " + n + " experiments");
    }

}
