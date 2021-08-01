import java.util.Scanner;

class marks{
    float maths,science,english;
    float total;
    float per;
    float CGPA;
    void calu(){
        total=maths+science+english;
        per=total/3;
        CGPA=per/9.5f;
    }
}

public class cgpa {
    public static void main(String[] args) {
        marks obj=new marks();
        Scanner sc =new Scanner(System.in);
        obj.maths=sc.nextFloat();
        obj.science=sc.nextFloat();
        obj.english=sc.nextFloat();
        obj.calu();
        System.out.println("total percentage"+obj.per);
        System.out.println("total CGPA"+obj.CGPA);
    }
    
}
