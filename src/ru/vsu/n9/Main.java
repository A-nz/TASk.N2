package ru.vsu.n9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point p1 = readPoint("p1");
        Point p2 = readPoint("p2");
        Point p3 = readPoint("p3");
        Point p4 = readPoint("p4");
        printResult(isSquare(p1, p2, p3, p4));
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

    private static boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
        return ((findDistance(p1, p2) + findDistance(p3, p4)) == (findDistance(p2, p3) + findDistance(p4, p1)))
                && ((findDistance(p2, p4) == findDistance(p1, p3)));
    }

    private static double findDistance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + ((p1.y - p2.y) * (p1.y - p2.y)));
    }

    private static void printResult(boolean result) {
        System.out.println("is this quadrilateral a square: " + result);
    }
}