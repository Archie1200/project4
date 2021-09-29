package java_programs;

import java.util.Scanner;

public class myarray {
    //program to print sum of all elements in array except those lying between 6 and 7.
    int arr[]=new int[5];
    public void display(int str[]){
        int sum1=0,sum2=0,index1=0,index2=0;
        for(int i=0;i<str.length;i++){
             if(str[i]==6)
                 index1=i;
             if(str[i]==7 && index1<i)
                 index2=i;
        }
        for(int i=index1;i<=index2;i++)
            sum1=sum1+str[i];
        for(int j=0;j<str.length;j++)
            sum2=sum2+str[j];
        System.out.println(sum2-sum1);
    }
}
class P1{
    public static void main(String[] args) {
        myarray obj = new myarray();
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<obj.arr.length;i++){
            obj.arr[i]=scan.nextInt();
        }
        obj.display(obj.arr);
    }
}
