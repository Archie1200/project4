package java_programs;

import java.util.Scanner;

public class employee {
    public int arr1[] = new int[3];
    public String arr2[] = new String[3];
    public String arr3[] = new String[3];
    public void DISPLAY(int arr1[],String arr2[],String arr3[]){
        System.out.println("Name"+"          "+"Yearofjoining"+"     "+"address");
        for(int i=0;i<3;i++){
            System.out.println(arr2[i]+"          "+arr1[i]+"          "+arr3[i]);
        }
    }
}
class P2{
    public static void main(String[] args) {
        employee obj = new employee();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<3;i++){
            obj.arr2[i]=scan.next();
        }
        for(int i=0;i<3;i++){
            obj.arr1[i]=scan.nextInt();
        }
        for(int i=0;i<3;i++){
            obj.arr3[i]=scan.next();
        }
        obj.DISPLAY(obj.arr1,obj.arr2,obj.arr3);
    }
}