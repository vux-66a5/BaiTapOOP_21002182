package lab05.mycomplexclass;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {


        return "(" + this.real + " + " + this.imag + "i" + ")";
    }

    public boolean isReal() {
        return Double.compare(this.imag, 0.0) == 0;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        return Double.compare(this.real, 0.0) == 0;
    }

    public boolean equals(double real, double imag) {
        return (Double.compare(this.real, real) == 0) && (Double.compare(this.imag, imag) == 0);
    }

    public boolean equals(MyComplex another) {
        return (Double.compare(this.real, another.real) == 0) && (Double.compare(this.imag, another.imag) == 0);
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real + right.real;
        newComplex.imag = this.imag + right.imag;
        return newComplex;
    }

}
