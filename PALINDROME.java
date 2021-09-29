package java_programs;

import java.util.Scanner;

public class PALINDROME{
    public int num1;
    public void print(int n){
        int rev=0,r,temp;
        temp=n;
        while(temp!=0){
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(rev==n){
            System.out.println(n+" "+"is a palindrome");
        }
        else{
            System.out.println(n+" "+"is not a palindrome");
        }
    }
}
class A1{
    public static void main(String[] args) {
        PALINDROME obj= new PALINDROME();
        Scanner scan = new Scanner(System.in);
        obj.num1=scan.nextInt();
        obj.print(obj.num1);
    }
}

