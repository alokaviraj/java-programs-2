import java.util.Scanner;

class Ans {
    int a, b, c;
    int result;

    public void sum() {
        result = a + b + c;
    }

}

class sumOfThreeNumber {
    public static void main(String[] args) {
        Ans obj = new Ans();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        obj.a = sc.nextInt();
        System.out.println("Enter the value of b");
        obj.b = sc.nextInt();
        obj.c = 5;
        System.out.println("value of c is  "+obj.c);
        obj.sum();
        System.out.println(obj.result);
    }
}