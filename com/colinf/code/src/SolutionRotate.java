package com.colinf.code.src;

import java.io.*;
import java.util.*;

public class SolutionRotate {

    // Complete the rotLeft function below.
    //Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
    // Output arr = [3, 4, 5, 6, 7, 1, 2]
    /* for(int i = 0; i < lengthOfArray; i++){
    int newLocation = ([0]i + (lengthOfArray[7] - shiftAmount[2])) % lengthOfArray[7];
    a[newLocation] = in.nextInt();
} */
    static int[] rotLeft(int[] a, int d) {
        int[] tmp = new int[d];
        tmp = Arrays.copyOfRange(a, 0, d);
        for (int i=0; i < (a.length - d); i++) {
            a[i] = a[i+d];
        }
        
        int k = d - 1;
        for (int j = a.length-1; j >= (a.length - d); j--){
            a[j] = tmp[k];
            k--;
        }
        return a;
    }

    public boolean rotateString(String A, String B) {
        StringBuffer sb = new StringBuffer(A);
        sb.append(A);
        return (sb.toString().contains(B) && A.length() == B.length());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
