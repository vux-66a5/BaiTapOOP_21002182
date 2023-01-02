package lab10.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly{
    List<Double> coefficients = new ArrayList<>();

    public ListPoly(double[] coeffs) {
        for(int i = 0; i < coeffs.length; i++) {
            coefficients.add(coeffs[i]);
        }
    }
    @Override
    public double[] coefficients() {
        double[] coeffArr = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffArr[i] = coefficients.get(i);
        }
        return coeffArr;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public int degree() {
        return coefficients.size() -1;
    }

    @Override
    public Poly derivative() {
        double[] deri = new double[coefficients.size()-1];
        for(int i = 0; i < deri.length; i++){
            deri[i] = (i+1)*coefficients.get(i+1);
        }
        Poly derivativeOf = new ArrayPoly(deri);
        return derivativeOf;
    }
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.degree(); i >= 0; i--) {
            if (i > 1) {
                description.append(this.coefficients.get(i)).append("x^").append(i).append(" + ");
            } else if (i > 0) {
                description.append(this.coefficients.get(i)).append("x").append(" + ");
            } else {
                description.append(this.coefficients.get(i));
            }
        }
        return description.toString();
    }

}
