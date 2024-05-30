package hus.oop.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        int degree = getDegree();
        for (int i = 0; i <= degree; i++) {
            double coefficient = getCoefficient(i);

            // Nếu hệ số khác 0
            if (coefficient != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }

                sb.append(coefficient);

                // Nếu bậc lớn hơn 0
                if (i > 0) {
                    sb.append("x");

                    // Nếu bậc lớn hơn 1
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }

        return "[" + sb.toString() + "]";
    }

    protected abstract double getCoefficient(int i);

    protected abstract int getDegree();


    /**
     * Lấy đạo hàm đa thức.
     */
    public void differentiate() {
        /* TODO */
    }
}
