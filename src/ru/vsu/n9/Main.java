package ru.vsu.n9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point p1 = readPoint("p1");
        Point p2 = readPoint("p2");
        Point p3 = readPoint("p3");
        Point p4 = readPoint("p5");
        double a = findDistance(p1, p2);
        double b = findDistance(p2, p3);
        double c = findDistance(p3, p4);
        double d = findDistance(p4, p1);
        double d1 = findDistance(p1, p3);
        double d2 = findDistance(p2, p4);

        System.out.print(isSquare(a, b, c, d, d1, d2));
    }

    private static Point readPoint(String name) {
        double x = readDouble(name + ".x");
        double y = readDouble(name + ".y");
        return new Point(x, y);
    }

    private static double readDouble(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s:", name);
        return scanner.nextDouble();
    }

    private static boolean isSquare(double a, double b, double c, double d, double d1, double d2) {
        return ((a+b)==(c+d)) && ((d1) == (d2));
    }

    private static double findDistance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + ((p1.y - p2.y) * (p1.y - p2.y)));
    }
}
