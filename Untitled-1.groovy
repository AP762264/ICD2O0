import java.lang.Math; // Import Math class for mathematical operations
import java.util.Scanner; // Import Scanner for user input

class MyClass { // Class name should match the filename (MyClass.java)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Calculate area of a rectangle
        System.out.println("Calculating the area of a rectangle.");
        System.out.print("Enter the length: "); // Prompt for length
        double length = scanner.nextDouble(); // Read length input
        System.out.print("Enter the width: "); // Prompt for width
        double width = scanner.nextDouble(); // Read width input
        double rectangleArea = length * width; // Calculate area of rectangle
        System.out.printf("Area of the rectangle: %.2f\n", rectangleArea); // Display result

        // Calculate area of a circle
        System.out.println("Calculating the area of a circle.");
        System.out.print("Enter the radius: "); // Prompt for radius
        double radius = scanner.nextDouble(); // Read radius input
        double circleArea = Math.PI * radius * radius; // Calculate area of circle
        System.out.printf("Area of the circle: %.2f\n", circleArea); // Display result

        // Calculate surface area and volume of a cylinder
        System.out.println("Calculating the surface area and volume of a cylinder.");
        System.out.print("Enter the radius: "); // Prompt for cylinder radius
        double cylinderRadius = scanner.nextDouble(); // Read cylinder radius input
        System.out.print("Enter the height: "); // Prompt for height
        double height = scanner.nextDouble(); // Read height input
        double cylinderVolume = Math.PI * cylinderRadius * cylinderRadius * height; // Calculate volume
        double cylinderSurfaceArea = 2 * Math.PI * cylinderRadius * height + 2 * Math.PI * cylinderRadius * cylinderRadius; // Calculate surface area
        System.out.printf("Volume of the cylinder: %.2f\n", cylinderVolume); // Display volume
        System.out.printf("Surface area of the cylinder: %.2f\n", cylinderSurfaceArea); // Display surface area

        // Calculate the period of a pendulum
        System.out.println("Calculating the period of a pendulum.");
        System.out.print("Enter the length of the pendulum (in meters): "); // Prompt for pendulum length
        double pendulumLength = scanner.nextDouble(); // Read length input
        double g = 9.8; // Acceleration due to gravity
        double period = 2 * Math.PI * Math.sqrt(pendulumLength / g); // Calculate period
        System.out.printf("Period of the pendulum: %.2f seconds\n", period); // Display result

        scanner.close(); // Close the scanner
    }
}