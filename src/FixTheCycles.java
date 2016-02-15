import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FixTheCycles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < 6; i++){
            int num = in.nextInt();
            arr[i] = num;
        }

        for (int i: arr)
        {
         System.out.println(i);
        }
    }
}