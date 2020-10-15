package ss5.ex2;

public class testPoint {
    public static void main(String[] args) {
        point p1 = new point(1,2);
        System.out.println(p1); //toString
        point p2 = new point(3,4);
        System.out.println(p2);

        p1.setX(3);
        p1.setY(4);
        System.out.println(p1); //run toString to inspect the modified instance

        System.out.println("X is: "+ p1.getX());
        System.out.println("Y is: "+ p1.getY());
        p1.setXY(5,6);
        System.out.println("X is: " + p1.getXY()[0]);
        System.out.println("Y is: " + p1.getXY()[1]);

        p2.setXY(10,11);
        System.out.printf("Distance is: %.2f%n",p1.distance(10,11));

        System.out.printf("Distance is: %.2f%n",p1.distance(p2));
        System.out.printf("Distance is: %.2f%n",p2.distance(p1));
        System.out.printf("Distance is: %.2f%n",p1.distance());
    }
}
