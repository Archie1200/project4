package java_programs;

import java.util.Scanner;

public class find {
    //program to check whether an element is present in an array or not
    public int n;
    public void Display1(int arr[],int n){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println(n+" "+"Found at index no."+" "+i);
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println(-1);
    }
}
class C1{
    public static void main(String[] args) {
        find obj=new find();
        Scanner scan = new Scanner(System.in);
        obj.n=scan.nextInt();
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        obj.Display1(arr, obj.n);
    }
}
