package java_programs;

import java.util.Scanner;

public class Every {
    // program to check whether an array contains only 1 or 4
    public int arr[];
    Every(int str[]){
       arr=str;
    }
    public void Display1(){
        int c=0,d=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                c++;
            else if(arr[i]==4)
                d++;
        }
        if(c+d==arr.length || c==arr.length || d==arr.length)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
class B1{
    public static void main(String[] args) {
        int str[]=new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<str.length;i++)
            str[i]=scan.nextInt();
        Every obj = new Every(str);
        obj.Display1();
    }
}
