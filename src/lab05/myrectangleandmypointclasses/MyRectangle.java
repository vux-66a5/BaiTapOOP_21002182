package lab05.myrectangleandmypointclasses;

public class MyRectangle {
    private final MyPoint vertexTopLeft;
    private final MyPoint vertexBottomRight;
    private final MyPoint vertexTopRight;
    private final MyPoint vertexBottomLeft;

    public MyRectangle(MyPoint pointTopLeft, MyPoint pointBottomRight) {
        this.vertexTopLeft = pointTopLeft;
        this.vertexBottomRight = pointBottomRight;
        this.vertexBottomLeft = new MyPoint(pointTopLeft.getX(), pointBottomRight.getY());
        this.vertexTopRight = new MyPoint(pointBottomRight.getX(), pointTopLeft.getY());
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        vertexTopLeft = new MyPoint(x1, y1);
        vertexBottomRight = new MyPoint(x2, y2);
        vertexBottomLeft = new MyPoint(x1, y2);
        vertexTopRight = new MyPoint(x2, y1);
    }

    public String toString() {
        String description = "MyRectangle[vertex1 = " +
                vertexTopLeft.toString() +
                ", vertex2 = " +
                vertexTopRight.toString() +
                ", vertex3 = " +
                vertexBottomRight.toString() +
                ", vertex4 = " +
                vertexBottomLeft.toString() +
                "]";
        return description;
    }

    public double getPerimeter() {
        return vertexBottomLeft.distance(vertexBottomRight) + vertexBottomRight.distance(vertexTopRight) + vertexTopRight.distance(vertexTopLeft) + vertexTopLeft.distance(vertexBottomLeft);
    }

    public double getArea() {
        return vertexBottomLeft.distance(vertexBottomRight) * vertexBottomRight.distance(vertexTopRight);
    }

}
