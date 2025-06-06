package Task3;

import Task1.Point;
import Task2.ClosedPolyLine;
import Task2.PolyLine;

public class Main3 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        Line line = new Line(p1, p2);

        PolyLine polyLine = new PolyLine(p1, p2, p3);

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(p1, p2, p3);

        LengthPrinter.printLengths(line, polyLine, closedPolyLine);
    }
}
