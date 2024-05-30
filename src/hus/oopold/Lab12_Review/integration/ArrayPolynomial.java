package hus.oopold.Lab12_Review.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] result = new double[size];
        System.arraycopy(coefficents, 0, result, 0, size);
        return result;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (size == coefficents.length) {
            enlarge();
        }
        coefficents[size++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if (size == coefficents.length) {
            enlarge();
        }
        System.arraycopy(coefficents, index, coefficents, index + 1, size - index);
        coefficents[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double sum = 0;
        for (int i = 0; i <= degree(); i++) {
            sum += coefficient(i) * Math.pow(x,i);
        }
        return sum;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        if (size <= 1) {
            return new ArrayPolynomial();
        }
        ArrayPolynomial derivative = new ArrayPolynomial();
        for (int i = 1; i < size; i++) {
            derivative.append(i * coefficient(i));
        }
        return derivative;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        int maxSize = Math.max(this.size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double coef1 = i < this.size ? this.coefficient(i) : 0;
            double coef2 = i < another.size ? another.coefficient(i) : 0;
            result.append(coef1 + coef2);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        int maxSize = Math.max(this.size, another.size);
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxSize; i++) {
            double coef1 = i < this.size ? this.coefficient(i) : 0;
            double coef2 = i < another.size ? another.coefficient(i) : 0;
            result.append(coef1 - coef2);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
        int newSize = this.size + another.size - 1;
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < newSize; i++) {
            result.append(0);
        }
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < another.size; j++) {
                result.coefficents[i + j] += this.coefficient(i) * another.coefficient(j);
            }
        }
        result.size = newSize;
        return result;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double[] newCoefficients = new double[coefficents.length * 2];
        System.arraycopy(coefficents, 0, newCoefficients, 0, coefficents.length);
        coefficents = newCoefficients;
    }
}
