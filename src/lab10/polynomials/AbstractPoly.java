package lab10.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        if (degree() == 0) {
            return new double[]{0};
        }
        double[] newCoEff = new double[degree() - 1];
        for (int i = 0; i < degree() - 1; i++) {
            newCoEff[i] = coefficient(i + 1) * (i + 1);
        }
        return newCoEff;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof AbstractPoly abstractPoly)) { //https://stackoverflow.com/questions/4186320/why-cast-after-an-instanceof
            return false;                               //if true -> downcast AbstractPoly(o) = abstractPoly
        }
        if (abstractPoly.degree() != degree()) {
            return false;
        }
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != abstractPoly.coefficient(i)) {
                return false;
            }
        }
        return true;
    }

    public AbstractPoly() {

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());

    }

    @Override
    public String toString() {
        return "In cc gi?";
    }
}
