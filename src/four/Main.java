package four;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = in.nextDouble();

        double area = (6*Math.pow(s,2))/(4*Math.tan(Math.PI/6));

        System.out.println("The area of the hexagon is " + area);
    }


}


