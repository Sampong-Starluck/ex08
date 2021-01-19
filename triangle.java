/*Create
class Point(attributes x,y as float),

Segment (attributes p1, p2 as Point),

and Triangle (attributes AB, BC, CA as Segment). Write a java program to calculate perimeter 
of a triangle using the 3 classes defined previously.)*/
import java.util.*;

public class triangle {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        point p1 = new point();
        point p2 = new point();
        point p3 = new point();
        segment seg = new segment();
        System.out.println("Enter the point for A:");
        System.out.print("x: ");
        p1.x = sc.nextInt();
        System.out.print("y: ");
        p1.y = sc.nextInt();

        System.out.println("Enter the point for B:");
        System.out.print("x: ");
        p2.x = sc.nextInt();
        System.out.print("y: ");
        p2.y = sc.nextInt();

        System.out.println("Enter the point for C:");
        System.out.print("x: ");
        p3.x = sc.nextInt();
        System.out.print("y: ");
        p3.y = sc.nextInt();

        double AB = seg.length(p1, p2);
        double BC = seg.length(p2, p3);
        double CA = seg.length(p3, p1);

        double peri = AB + BC + CA;

        System.out.println(peri);
    }


}
