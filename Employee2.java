package java_programs;

public class Employee2 {
    public int sal;
    public int hrs;
    public void getInfo(int a,int b){
        if(a<500){
            sal=AddSal();
            System.out.println(sal);
        }
        if(b>6){
            sal=AddWork();
            System.out.println(sal);
        }
    }
    public int AddSal(){
        sal=sal+10;
        return sal;
    }
    public int AddWork(){
        sal=sal+5;
        return sal;
    }
}
class P3{
    public static void main(String[] args) {
        Employee2 obj = new Employee2();
        obj.sal=Integer.parseInt(args[0]);
        obj.hrs=Integer.parseInt(args[1]);
        obj.getInfo(obj.sal,obj.hrs);
    }
}
