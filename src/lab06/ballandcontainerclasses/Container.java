package lab06.ballandcontainerclasses;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width;
        this.y2 = y1 - height;
    }

    public int getX() {
        return (x1 + x2) / 2;
    }

    public int getY() {
        return (y1 + y2) / 2;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y1 - y2;
    }

    public boolean collidesWith(Ball ball) {
        if ((ball.getX() - ball.getRadius() <= this.x1) || (ball.getX() + ball.getRadius() >= this.x2)) {
            ball.reflectHorizontal();
            return true;
        }
        if ((ball.getY() - ball.getRadius() <= this.y2) || (ball.getY() + ball.getRadius() >= this.y1)) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }

    public String toString() {
        return "Container at (" + this.x1 + "," + this.y1 + ") to (" + this.x2 + "," + this.y2 + ")";
    }
}
