package five;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = in.nextInt();

        System.out.print("Enter the side: ");
        double s = in.nextDouble();

        double area = (n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));

        System.out.println("The area of the hexagon is " + area);
    }
}
