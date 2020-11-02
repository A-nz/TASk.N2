package ru.vsu.n9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point point1 = readPoint("coordinate 1");
        Point point2 = readPoint("coordinate 2");
        Point point3 = readPoint("coordinate 3");
        Point point4 = readPoint("coordinate 4");
        printResult(isSquare(point1, point2, point3, point4));
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

    private static boolean isSquare(Point point1, Point point2, Point point3, Point point4) {
        return ((findDistance(point1, point2) + findDistance(point3, point4)) ==
                (findDistance(point2, point3) + findDistance(point4, point1)))
                && ((findDistance(point2, point4) == findDistance(point1, point3)));
    }

    private static double findDistance(Point point1, Point point2) {
        return Math.sqrt((point1.x - point2.x) * (point1.x - point2.x) +
                ((point1.y - point2.y) * (point1.y - point2.y)));
    }

    private static void printResult(boolean result) {
        System.out.println("is this quadrilateral a square: " + result);
    }
}