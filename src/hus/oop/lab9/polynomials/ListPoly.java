package hus.oop.lab9.polynomials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListPoly extends AbstractPoly {
    private final List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        this.coefficients = Arrays.stream(coeffs)
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public int degree() {
        return this.coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(this.derive());
    }

    @Override
    public double[] coefficients() {
        double[] target = new double[coefficients.size()];
        for (int i = 0; i < target.length; i++) {
            target[i] = coefficients.get(i);
        }
        return target;
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree - 1);
    }
}
