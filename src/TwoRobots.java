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

    public static class Robot {
        private int location;

        public Robot(){
            this.location = -1;
        }

        public void setLocation(int location){
            this.location = location;
        }

        public int getLocation(){
            return this.location;
        }
    }

    public static class Containers {
        private int containers;
        public Containers(int size){
            this.containers = size;
        }

        public int getSize(){
            return this.containers;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //number of testcases
        int n = in.nextInt();

        //for each test case
        for(int i = 0; i < n; i++){
            //number of containers
            int M = in.nextInt();
            Containers containers = new Containers(M);

            //total distance robots travel
            int D = 0;

            //two new robots
            Robot r1 = new Robot();
            Robot r2 = new Robot();

            //number of queries
            int queries = in.nextInt();

            //for each query
            for(int j = 0; j < queries; j++){
                //container to take candy from
                int Mi = in.nextInt();
                //container to put candy in
                int Mj = in.nextInt();

                //if robot1 has not been used before set their location to container Mi
                if(r1.getLocation() == -1){
                    r1.setLocation(Mi);
                    //add distance robot between location & dest to total travelled
                    D += Math.abs(r1.getLocation() - Mj);
                }
                else if(r1.getLocation() == -1) {
                    //check which robot has a closer location to container being transported from
                }
            }
        }
    }
}