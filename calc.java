import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        add obj= new add();
        // obj.sum();
        // obj.diff();
        // obj.mult();
        obj.div();        
    }
    
}
class add{
    Scanner sc =new Scanner(System.in);
    int a,b,c;
    void sum(){
        System.out.println("enter value of a");
        a=sc.nextInt();
        System.out.println("enter value of b");
        b=sc.nextInt();
        c=a+b;
        System.out.println("sum="+c);
    }
    void diff(){
        System.out.println("enter value of a");
        a=sc.nextInt();
        System.out.println("enter value of b");
        b=sc.nextInt();
        c=a-b;
        System.out.println("diff="+c);
    }
    void mult(){
        System.out.println("enter value of a");
        a=sc.nextInt();
        System.out.println("enter value of b");
        b=sc.nextInt();
        c=a*b;
        System.out.println("mult="+c);

    }
    void div(){ 
        System.out.println("enter value of a");
        a=sc.nextInt();
        System.out.println("enter value of b");
        b=sc.nextInt();
        if(b==0){
            System.out.println("zero not allowed");
        }
        else{c=a/b;
        
        System.out.println("div="+c);}


    }
}