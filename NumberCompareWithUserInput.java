import java.util.*;
import java.util.Scanner;

public class NumberCompareWithUserInput {

    public static void main(String[] args) {
        Random r=new Random();
        Scanner obj=new Scanner(System.in);
        int n=r.nextInt(20);
        System.out.print("Enter your number ");
        int num=obj.nextInt();
        if(n>num){
        System.out.print(" your number "+num+" is lesser than random number");
    }
        else if(n==num){
            System.out.print("Both number are equal");
        }
        else{
            System.out.print(" your number "+num+" is greater than the Random number");
        }
    }
}