package hus.oopold.Lab12_Review.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= degree(); i++) {
            if (i > 0) {
                result.append(" + ");
            }
            result.append(coefficient(i)).append("x^").append(i);
        }
        return result.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        // If the polynomial is a constant or empty, its derivative is 0 or an empty array
        if (coefficients() == null || coefficients().length <= 1) {
            return new double[] {};
        }

        // The length of the derivative array is one less than the original array
        double[] derivative = new double[coefficients().length - 1];

        // Compute the coefficients of the derivative
        for (int i = 1; i < coefficients().length; i++) {
            derivative[i - 1] = i * coefficients()[i];
        }

        return derivative;
    }
}
