package lab10.polynomials;

public class ArrayPoly extends AbstractPoly{
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return coefficients;

    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
//        Poly derivativeOf = new ArrayPoly(derive());
        double[] deri = new double[coefficients.length-1];
        for(int i = 0; i < deri.length; i++){
            deri[i] = (i+1)*coefficients[i+1];
        }
        Poly derivativeOf = new ArrayPoly(deri);
        return derivativeOf;
    }
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.degree(); i >= 0; i--) {
            if (i > 1) {
                description.append(this.coefficients[i]).append("x^").append(i).append(" + ");
            } else if (i > 0) {
                description.append(this.coefficients[i]).append("x").append(" + ");
            } else {
                description.append(this.coefficients[i]);
            }
        }
        return description.toString();
    }
}
