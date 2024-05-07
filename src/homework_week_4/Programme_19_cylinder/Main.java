package homework_week_4.Programme_19_cylinder;

/**
 *
 * 3. Write a class with the name Main that have main method
 * TEST EXAMPLE
 * → TEST CODE: Write below code into main method
 * Circle circle = new Circle(3.75);
 * System.out.println("circle.radius= " + circle.getRadius());
 * System.out.println("circle.area= " + circle.getArea());
 * Cylinder cylinder = new Cylinder(5.55, 7.25);
 * System.out.println("cylinder.radius= " + cylinder.getRadius());
 * System.out.println("cylinder.height= " + cylinder.getHeight());
 * System.out.println("cylinder.area= " + cylinder.getArea());
 * System.out.println("cylinder.volume= " + cylinder.getVolume());
 */
public class Main {

    //Declare main method
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25); //Create object
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
