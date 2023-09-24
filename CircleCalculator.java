import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate the diameter
        double diameter = 2 * radius;

        // Calculate the area
        double area = Math.PI * radius * radius;

        System.out.println("Diameter: " + diameter);
        System.out.println("Area: " + area);
    }
}
