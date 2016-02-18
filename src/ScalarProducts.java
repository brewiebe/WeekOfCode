import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by brewi on 2016-02-17.
 *
 * Write a function generator, gen, to generate the remaining values for a2 through a2n+1a2n+1.
 * The values returned by gen describe two-dimensional vectors v1…vnv1…vn, where each sequential
 * pair of values describes the respective xx and yy coordinates for some vector vv in the form x1,y1,x2,y2,…,xn,ynx1,y1,x2,y2,…,xn,yn.
 * In other words, v1=(a2,a3),v2=(a4,a5),…,vn=(a2n,a2n+1)v1=(a2,a3),v2=(a4,a5),…,vn=(a2n,a2n+1).
 * Let S be the set of scalar products of vi and vj for each 1≤i,j≤n1≤i,j≤n, where i≠j.
 * Determine the number of different residues in S and print the resulting value modulo M.
 */
public class ScalarProducts {

    /*Integer sequence a having length 2n+22n+2 is defined as follows:
    a0=0a0=0
    a1=Ca1=C
    ai+2=(ai+1+ai) % Mai+2=(ai+1+ai) % M, where 0≤i<2n*/
    public static int[] gen(int a, int mod, int n){
        int[] output = new int[(n*2)+2];
        output[0] = 0;
        output[1] = a;
        for(int i = 0; i < (n * 2); i++){
            int temp = output[i+1] + output[i];
            output[i + 2] = temp % mod;
        }
        return output;
    }

    public static void printArray(int[] arr){
        for (int a: arr) {
            System.out.println(a);
        }
    }

    public static List<int[]> genVectors(int [] arr){
        List<int[]> vectors = new ArrayList<>();
        for (int i = 2; i < arr.length; i += 2){
            int[] a = new int[2];
            a[0] = arr[i];
            a[1] = arr[i+1];
            vectors.add(a);
        }
        return vectors;
    }

    public static void printVectors(List<int[]> vecs){
        for (int[] a: vecs) {
            System.out.println("Vector: " + a[0] + ", " + a[1]);
        }
    }

    public static int scalarProduct(int[] a, int[] b){
        return (a[0] * b[0]) + (a[1] * b[1]);
    }

    public static List<Integer> scalarList(List<int[]> vectorList){
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < vectorList.size(); i++){
            for(int j = i + 1; j < vectorList.size(); j++){
                temp.add(scalarProduct(vectorList.get(i), vectorList.get(j)));
            }
        }
        return temp;
    }

    public static void printProducts(List<Integer> prodList){
        for (int i: prodList)
        {
            System.out.println("Product: " + i);
        }
    }

    public static List<Integer> residues(List<Integer> prodList, int mod){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i: prodList) {
            int residue = i % mod;
            if(temp.indexOf(residue) == -1){
                temp.add(residue);
            }
        }
        return temp;
    }


    public static void printResidues(List<Integer> resList){
        for (int i: resList)
        {
            System.out.println("Residue: " + i);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        int M = in.nextInt();
        int n = in.nextInt();

        //generate sequence of numbers for vectors as described above
        int[] vectorsArray = gen(C, M, n);
        //printArray(vectorsArray);

        //generate arraylist of vectors for calculating scalar product
        List<int[]> vectors = genVectors(vectorsArray);
        //printVectors(vectors);

        //calculate scalar product of vectors in list
        //return list of scalar products
        List<Integer> products = scalarList(vectors);
        //printProducts(products);

        //return array of unique residues
        List<Integer> residues = residues(products, M);
        //printResidues(residues);

        //print final answer of # of unique resides % original M value enter
        System.out.println(residues.size() % M);

    }
}
