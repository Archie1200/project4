package java_programs;

import java.util.Scanner;

public class ASCII {
    // to print character corresponding to the ascii values
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char) arr[i]+" ");
        }
    }
}
