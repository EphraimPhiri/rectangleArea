import java.util.Scanner;

public class rectangleArea{
    public static void main (String [] Args){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter length:");
        double length= input.nextDouble();
         System.out.println("Enter breadth:");
        double breadth= input.nextDouble();
        Area area1 = new Area(length, breadth);
        System.out.println("The area is "+ area1.returnArea());

    }
}
class Area{
    private double length;
    private double breadth;
    public Area(double l, double b){
        length = l;
        breadth= b;

    }
    public double returnArea(){
        double area = length * breadth;
        return area;
    }
}