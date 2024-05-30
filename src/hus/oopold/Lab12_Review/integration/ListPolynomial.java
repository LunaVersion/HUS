package hus.oopold.Lab12_Review.integration;


import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] result = new double[coefficients.size()];
        System.arraycopy(coefficients, 0, result, 0, coefficients.size());
        return result;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        /* TODO */
        coefficients.add(index,coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficients.set(index,coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < degree(); i++) {
            sum += coefficient(i) * Math.pow(x, i);
        }
        return sum;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        if (coefficients.size() <= 1) return new ListPolynomial();
        ListPolynomial derivative = new ListPolynomial();
        for (int i = 0; i < coefficients.size(); i++) {
            derivative.append(i * coefficient(i));
        }
        return derivative;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        int maxSize = Math.max(this.degree(),another.degree());
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double coef1 = i < this.degree() ? this.coefficient(i) : 0;
            double coef2 = i < another.degree() ? another.coefficient(i) : 0;
            result.append(coef1 + coef2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        int maxSize = Math.max(this.degree(), another.degree());
            ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double coef1 = i < this.degree() ? this.coefficient(i) : 0;
            double coef2 = i < another.degree() ? another.coefficient(i) : 0;
            result.append(coef1 - coef2);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        int newDegree= this.degree() + another.degree();
        ListPolynomial result = new ListPolynomial();
        for (int i = 0; i < newDegree; i++) {
            result.append(0);
        }
        for (int i = 0; i < this.degree(); i++) {
            for (int j = 0; j < another.degree(); j++) {
                result.coefficients.set(i+j, this.coefficient(i) * another.coefficient(j));
            }
        }
        return result;
    }
}
