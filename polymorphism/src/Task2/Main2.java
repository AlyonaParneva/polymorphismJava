package Task2;

import Task1.Point;

public class Main2 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        PolyLine line = new PolyLine(p1, p2, p3);
        System.out.println("Длина ломаной: " + line.length());

        ClosedPolyLine closedLine = new ClosedPolyLine(p1, p2, p3);
        System.out.println("Длина замкнутой ломаной: " + closedLine.length());
    }
}
