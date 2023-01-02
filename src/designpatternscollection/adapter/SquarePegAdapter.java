package designpatternscollection.adapter;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;
    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }
    public double getRadius() {
        return Math.sqrt(2* peg.getWidth()* peg.getWidth())/2;
    }
}
