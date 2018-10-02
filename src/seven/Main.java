package seven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a = 360/5;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double r = in.nextDouble();

        double x1 = r*Math.cos(Math.toRadians(a));
        double y1 = r*Math.sin(Math.toRadians(a));

        double x2 = r*Math.cos(Math.toRadians(a*2));
        double y2 = r*Math.sin(Math.toRadians(a*2));

        double x3 = r*Math.cos(Math.toRadians(a*3));
        double y3 = r*Math.sin(Math.toRadians(a*3));

        double x4 = r*Math.cos(Math.toRadians(a*4));
        double y4 = r*Math.sin(Math.toRadians(a*4));

        double x5 = r*Math.cos(Math.toRadians(a*5));
        double y5 = r*Math.sin(Math.toRadians(a*5));

        System.out.println("The coordinates of the five points on the pentagon are");
        System.out.printf("%4.2f   %4.2f \n", y1, x1);
        System.out.printf("%4.2f   %4.2f \n", y5, x5);
        System.out.printf("%4.2f   %4.2f \n", y4, x4);
        System.out.printf("%4.2f   %4.2f \n", y3, x3);

        System.out.printf("%4.2f   %4.2f \n", y2, x2);

    }
}
