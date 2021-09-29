package java_programs;

import java.util.Scanner;

public class Reverse {
    // printing 2d elements in reverse
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        int temp,p=0;
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <2; j++) {
                arr[i][j] = Integer.parseInt(args[p]);
                p++;
            }
        }
        for (int i=1; i>=0; i--) {
            for (int j =1; j>=0; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
