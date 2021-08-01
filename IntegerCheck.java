import java.util.Scanner;

public class IntegerCheck {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        if(obj.hasNextInt()){       // for string use  hasnext or hasnextLine
        System.out.print(obj.nextInt()+" is an integer");}
        else
        {
            System.out.print(obj.next()+" is not an integer");
        }
    }
}