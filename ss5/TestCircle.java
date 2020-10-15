package ss5;

public class TestCircle {
    private double radius;
    private String color;

    public TestCircle(){
        radius = 1.0;
        color ="red";
    }
    public TestCircle(double r){
        radius = r;
        color = "red";
    }
    public TestCircle(double r,String c){
        radius = r;
        color = c;
    }

    public double getRadius() { return radius; }
    public String getColor() { return color; }
    public double getArea(){ return radius*radius*Math.PI; }

    public static void main(String[] args) {
        TestCircle c1 = new TestCircle(2.0,"blue");
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.println("The area is: " + c1.getArea());
        ///////////////////
        TestCircle c2 = new TestCircle(3.0,"red");
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.println("The area is: " + c2.getArea());
        /////////////////////
        TestCircle c3 = new TestCircle();
        System.out.println("The radius is: " + c3.getRadius() );
        System.out.println("The color is: " + c3.getColor());
        System.out.println("The area is: " + c3.getArea());
    }
}
