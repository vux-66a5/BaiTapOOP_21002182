package lab05.mypolynomialclass;

public class MyPolynomial {
    private final double[] coeffs;

    public MyPolynomial(double... coeffs) { //double[] coeffs //Varargs
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.getDegree(); i >= 0; i--) {
            if (i > 1) {
                description.append(this.coeffs[i]).append("x^").append(i).append(" + ");
            } else if (i > 0) {
                description.append(this.coeffs[i]).append("x").append(" + ");
            } else {
                description.append(this.coeffs[i]);
            }
        }
        return description.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0.0;
        for (int i = this.getDegree(); i >= 0; i--) {
            polyValue = polyValue * x + this.coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] addPolyData = new double[maxDegree + 1]; // bac 2 co 3 he so, bac 3 co 4 he so
        //add this.degree to newPoly
        if (this.getDegree() + 1 >= 0) System.arraycopy(this.coeffs, 0, addPolyData, 0, this.getDegree() + 1);
        //add right.degree to newPoly
        for (int i = 0; i <= right.getDegree(); i++) {
            addPolyData[i] += right.coeffs[i];

        }
        MyPolynomial addPoly = new MyPolynomial(addPolyData);
        return addPoly;
    }

    public MyPolynomial mutiply(MyPolynomial right) {
        int multiPolyDegree = this.getDegree() + right.getDegree();
        double[] multiPolyData = new double[multiPolyDegree + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                multiPolyData[i + j] += this.coeffs[i] + right.coeffs[j];
            }
        }
        MyPolynomial multiPoly = new MyPolynomial(multiPolyData);
        return multiPoly;
    }
}
