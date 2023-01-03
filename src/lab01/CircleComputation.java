package lab01;

import java.util.Scanner;

public class CircleComputation {
    public static void circleComputation(double radius) {
        System.out.println("-----Circle1-----");
        System.out.printf("Diameter is: %.2f%n", 2.0 * radius);
        System.out.printf("Circumference is: %.2f%n", Math.PI * radius * 2);
        System.out.printf("Area is: %.2f%n", Math.PI * radius * radius);
        System.out.println();
    }

    public static void sphereComputation(double radius) {
        System.out.println("-----Sphere-----");
        System.out.printf("Surface area of sphere is: %.2f%n", 4 * Math.PI * radius * radius);
        System.out.printf("Volume of sphere is: %.2f%n", (double) 4 / 3 * Math.PI * radius * radius * radius);
        System.out.println();
    }

    public static void cylinderComputation(double radius, Scanner scan) {
        System.out.println("-----Cylinder-----");
        System.out.println("Input height: ");
        double height = scan.nextDouble();
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        double volume = baseArea * height;
        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = scan.nextDouble();
        circleComputation(radius);
        sphereComputation(radius);
        cylinderComputation(radius, scan);
    }
}
