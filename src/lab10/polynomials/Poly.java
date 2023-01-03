package lab10.polynomials;

public interface Poly {
    double[] coefficients();

    double coefficient(int degree);

    int degree();

    Poly derivative();
}
