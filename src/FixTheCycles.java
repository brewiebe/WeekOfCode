import java.util.*;

/*
Day 1 - Week of Code
The total weight of a simple cycle is the sum of its edge weights (e.g.: A→C→D→AA→C→D→A has a total weight of e+d+ae+d+a).
If the total weight is negative, it's called a negative cycle.

Given edge weights aa, bb, cc, dd, ee, and ff, find some minimum non-negative integer (pp) that, when added to one single edge
weight in the graph, will get rid of any negative cycles.

 */
public class FixTheCycles {

    public static void main(String[] args) {
        // read the edge weights into the array
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++){
            int num = in.nextInt();
            arr[i] = num;
        }

        /*
        possible paths -- b, c, d, a
                          1 - 2 - 3 - 0
                          b, f, a
                          1 - 5 - 0
                          e, d, a
                          4 - 3 - 0
         */

        int[] paths = new int[3];
        paths[0] = arr[1] + arr[2] + arr[3] + arr[0];
        paths[1] = arr[1] + arr[5] + arr[0];
        paths[2] = arr[4] + arr[3] + arr[0];

        int smallestPath = 0;
        //find the smallest possible path
        for (int i: paths) {
            if(i < smallestPath){
                smallestPath = i;
            }
        }
        //if at least one path is neg calculate
        if (smallestPath < 0){
            int addTo = smallestPath * -1;
            System.out.println(addTo);
        }
        else { // else print this
            System.out.println("0");
        }


    }
}