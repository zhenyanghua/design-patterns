import java.util.Arrays;
import java.util.Iterator;

public class Polyline implements Iterable<Point> {
    private Point[] points;
    private int lastIndex;

    public Polyline() {
        points = new Point[2];
        lastIndex = 0;
    }

    public void extend(Point point) {
        // Double array
        if (lastIndex == points.length) {
            Point[] tempPoints = new Point[points.length * 2];
            System.arraycopy(points, 0, tempPoints, 0, points.length);
            points = tempPoints;
        }

        points[lastIndex++] = point;
    }

    @Override
    public Iterator<Point> iterator() {
        return new Iterator<Point>() {
            private int currentIndex = 0;
            private int emptySlots = 0;

            @Override
            public boolean hasNext() {
                while (currentIndex < points.length) {
                    if (points[currentIndex] == null) {
                        currentIndex++;
                        emptySlots++;
                    } else {
                        return true;
                    }
                }
                checkCompression();
                return false;
            }

            @Override
            public Point next() {
                return points[currentIndex++];
            }

            @Override
            public void remove() {
                points[currentIndex] = null;
            }

            private void checkCompression() {
                if (emptySlots > lastIndex / 4) {
                    int emptyIndex = -1;
                    for(int i = 0; i < points.length; i++) {
                        if (points[i] != null && emptyIndex > -1) {
                            points[emptyIndex++] = points[i];
                            points[i] = null;
                        } else if (points[i] == null && emptyIndex == -1) {
                            emptyIndex = i;
                        }
                    }
                    lastIndex = emptyIndex;
                    emptySlots = 0;
                    // Halve array
                    Point[] tempPoints = new Point[points.length / 2];
                    System.arraycopy(points, 0, tempPoints, 0, lastIndex);
                    points = tempPoints;
                }
            }
        };
    }

    @Override
    public String toString() {
        return "Polyline{" +
            "points=" + Arrays.toString(points) +
            '}';
    }

    public static void main(String[] args) {
        Polyline polyline = new Polyline();
        polyline.extend(new Point(0, 0));
        polyline.extend(new Point(10, 0));
        polyline.extend(new Point(10, 10));
        polyline.extend(new Point(0, 10));

        for (Point point: polyline) {
            System.out.println(point);
        }

        Iterator<Point> iterator = polyline.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }

        System.out.println(polyline);
    }
}
