package hus.oop.lab9.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    private Poly p;

    double[] derive() {
        int degree = this.degree();
        double[] coeffs = coefficients();
        double[] derivedCoeffs = new double[degree];
        for (int i = degree; i > 0; i--) {
            derivedCoeffs[i - 1] = coeffs[i] * i;
        }
        return derivedCoeffs;
    }

    @Override
    public boolean equals(Object o) {
        if (o==this) {
            return true;
        }
        if (!(o instanceof Poly )) {
            return false;
        }
        if (degree() != p.degree()) {
            return false;
        }
        double[] coeffs = coefficients();
        double[] otherCoeffs = p.coefficients();
        for (int i = 0; i <= degree(); i++) {
            if (coeffs[i] != otherCoeffs[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int degree = degree();
        double[] coeffs = coefficients();
        for (int i = degree; i >= 0; i--) {
            if (i == degree) {
                sb.append(coeffs[i]);
                sb.append("x^");
                sb.append(i);
            } else {
                if (coeffs[i] < 0) {
                    sb.append(" - ");
                    sb.append(-coeffs[i]);
                } else if (coeffs[i] > 0) {
                    sb.append(" + ");
                    sb.append(coeffs[i]);
                }
                if (coeffs[i] != 0) {
                    if (i == 1) {
                        sb.append("x");
                    } else if (i > 1) {
                        sb.append("x^");
                        sb.append(i);
                    }
                }
            }
        }
        if (sb.length() == 0) {
            sb.append("0");
        }
        return sb.toString();
    }
}
