package lab06.ballandcontainerclasses;

public class Ball {
    private float x, y, xDelta, yDelta;
    private int radius;

    public Ball(float x, float y, int radius, int speed, int direction) {
        //deltaX = d * cos(theta)
        //deltaY = d * sin(theta)
        //d ~ speed ; theta ~ direction ( from -180 to 180 degrees )
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(Math.toRadians(direction)));
        this.yDelta = (float) (speed * Math.sin(Math.toRadians(direction)));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    public String toString() {
        return "Ball[(" + this.x + "," + this.y + "),speed=(" + this.xDelta + "," + this.yDelta + ")]";
//        return "Ball at (" + this.x + "," + this.y + ") of velocity (" + this.xDelta + "," + this.yDelta + ")";
    }
}
