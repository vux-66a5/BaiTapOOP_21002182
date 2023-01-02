package lab11.designpatterns.adapter;

public class RoundHole {
    private double radius;
    public RoundHole(int radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }
}
