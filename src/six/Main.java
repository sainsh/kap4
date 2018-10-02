package six;

public class Main {

    public static void main(String[] args) {


        double r = 40.0;
        double x1,y1,a1,x2,y2,a2,x3,y3,a3;

        double tempA;

        double l,m,n;

        // first point
        tempA = Math.random()*2*Math.PI;
        x1= r*Math.cos(tempA);
        y1= r*Math.sin(tempA);


        // second point
        tempA = Math.random()*2*Math.PI;
        x2= r*Math.cos(tempA);
        y2= r*Math.sin(tempA);


        // third point
        tempA = Math.random()*2*Math.PI;
        x3= r*Math.cos(tempA);
        y3= r*Math.sin(tempA);

        l = Math.abs((x1-x2)/(y1-y2));
        m = Math.abs((x2-x3)/(y2-y3));
        n = Math.abs((x3-x1)/(y3-y1));

        a1 = Math.acos((Math.pow(m,2)+Math.pow(n,2)-Math.pow(l,2))/2*m*n);
        a2 = Math.acos((Math.pow(l,2)+Math.pow(n,2)-Math.pow(m,2))/2*l*n);
        a3 = Math.acos((Math.pow(l,2)+Math.pow(m,2)-Math.pow(n,2))/2*l*m);


        System.out.println("First Point:");
        System.out.println("X: " + x1 + " Y: " + y1 + " Angle: " + a1 + " radians");

        System.out.println("Second Point:");
        System.out.println("X: " + x2 + " Y: " + y2 + " Angle: " + a2 + " radians");

        System.out.println("Third Point:");
        System.out.println("X: " + x3 + " Y: " + y3 + " Angle: " + a3 + " radians");

    }
}
