package Task2;

import Task1.Point;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double length() {
        double sum = super.length();
        double dx = points[points.length - 1].x - points[0].x;
        double dy = points[points.length - 1].y - points[0].y;
        sum += Math.sqrt(dx * dx + dy * dy);

        return sum;
    }
}
