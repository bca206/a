import java.util.*;

class lab01{
    public static void main(String[] args) {
        float area,circum,radius,pi=3.14f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle");
        radius =sc.nextFloat();
        area=pi*radius*radius;
        circum=2*pi*radius;
        System.out.println("area of circle="+area);
        System.out.println("circumference of circle="+circum);
    }
}