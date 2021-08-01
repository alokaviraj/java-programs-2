import java.util.Scanner;

public class KillometerToMiles {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the killometer ");
        float km=obj.nextFloat();
        float totalmiles=0.62137f*km;
        System.out.print("Total miles in "+km+"km is "+totalmiles);
    }
    
}
