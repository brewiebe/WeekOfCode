/**
 * Created by brewi on 2016-02-16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* DAY 2 - Two Robots
You have a warehouse with MM containers filled with an infinite number of candies. The containers are arranged in a single row,
equally spaced to be 11 meter apart. You also have 22 robots that can pick up 11 piece of candy and transport it between any two
containers.

The robots take instructions in the form of queries consisting of two integers, MaMa and MbMb, respectively. To execute a query,
a robot travels to container MaMa, picks up 11 candy, transports it to container MbMb, and then stops at MbMb until it receives
another query.

Calculate the minimum total distance the robots must travel to execute NN queries in order.
 */

public class TwoRobots {

    public class Robot {
        private int location;
        public Robot(int location){
            this.location = location;
        }
    }

    public class Containers {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        //for each test case
        for(int i = 0; i < N; i++){
            int M = in.nextInt();

        }
    }
}