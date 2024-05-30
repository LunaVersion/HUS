package hus.oop.lab9.polynomials;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coeffs) {
        this.coefficients = coeffs;
    }

    @Override
    public int degree() {
        return this.coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(this.derive());
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree - 1];
    }
}
