//package hus.oop.integration;
//
//public class ArrayPolynomial extends AbstractPolynomial {
//    private static final int DEFAULT_CAPACITY = 2;
//    private double[] coefficents;
//    private int size;
//
//    /**
//     * Khởi tạo dữ liệu mặc định.
//     * @param resultCoefficients
//     */
//    public ArrayPolynomial(double[] resultCoefficients) {
//        /* TODO */
//    }
//
//    /**
//     * Lấy hệ số của đa thức tại phần tử index
//     * @return hệ số tại phần tử index.
//     */
//    @Override
//    public double coefficient(int index) {
//        /* TODO */
//    }
//
//    /**
//     * Lấy mảng các hệ số của đa thức.
//     * @return mảng các hệ số của đa thức.
//     */
//    @Override
//    public double[] coefficients() {
//        /* TODO */
//        double[] target = new double[coefficents.length];
//        for (int i = 0; i < target.length; i++) {
//            target[i] = coefficents[i];
//        }
//        return target;
//    }
//
//    /**
//     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
//     * @param coefficient
//     * @return đa thức hiện tại.
//     */
//    public ArrayPolynomial append(double coefficient) {
//        /* TODO */
//    }
//
//    /**
//     * Thêm một phần tử có hệ số coefficient vào vị trí index.
//     * @param coefficient
//     * @param index
//     * @return đa thức hiện tại.
//     */
//    public ArrayPolynomial insert(double coefficient, int index) {
//        /* TODO */
//    }
//
//    /**
//     * Thay đổi hệ số của đa thức tại phần tử index.
//     * @param coefficient
//     * @param index
//     * @return đa thức hiện tại.
//     */
//    public ArrayPolynomial set(double coefficient, int index) {
//        /* TODO */
//    }
//
//    /**
//     * Lấy bậc của đa thức.
//     * @return bậc của đa thức.
//     */
//    @Override
//    public int degree() {
//        /* TODO */
//    }
//
//    /**
//     * Tính giá trị của đa thức khi biết giá trị của x.
//     * @return giá trị của đa thức.
//     */
//    @Override
//    public double evaluate(double x) {
//        /* TODO */
//        double result = 0.0;
//        double[] coefficients = coefficients();
//        for (int i = 0; i < coefficients.length; i++) {
//            result = result + coefficients[i] * Math.pow(x, i);
//        }
//        return result;
//    }
//
//    /**
//     * Lấy đạo hàm của đa thức.
//     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
//     */
//    @Override
//    public Polynomial derivative() {
//        /* TODO */
//    }
//
//    /**
//     * Cộng một đa thức khác vào đa thức hiện tại.
//     * @param another
//     * @return đa thức hiện tại.
//     */
//    public ArrayPolynomial plus(ArrayPolynomial another) {
//        /* TODO */
//
//    }
//
//    private void setCoefficient(int i, double sum) {
//    }
//
//    /**
//     * Trừ đa thức hiện tại với đa thức khác.
//     * @param another
//     * @return đa thức hiện tại.
//     */
//    public ArrayPolynomial minus(ArrayPolynomial another) {
//        /* TODO */
//        int maxDegree = Math.max(this.coefficents.length - 1, another.coefficents.length - 1);
//        double[] resultCoefficients = new double[maxDegree + 1];
//
//        for (int i = 0; i <= maxDegree; i++) {
//            double coefficient1 = (i < this.coefficents.length) ? this.coefficents[i] : 0.0;
//            double coefficient2 = (i < another.coefficents.length) ? another.coefficents[i] : 0.0;
//            resultCoefficients[i] = coefficient1 + coefficient2;
//        }
//
//        return new ArrayPolynomial(resultCoefficients);
//    }
//
//    /**
//     * Nhân đa thức hiện tại với đa thức khác.
//     * @param another
//     * @return đa thức hiện tại.
//     */
//    public ArrayPolynomial multiply(ArrayPolynomial another) {
//        /* TODO */
//    }
//
//    /**
//     * Thêm kích thước để lưu đa thức khi cần thiết.
//     */
//    private void enlarge() {
//        /* TODO */
//    }
//
//    @Override
//    protected double getCoefficient(int i) {
//        return 0;
//    }
//
//    @Override
//    protected int getDegree() {
//        return this.coefficents.length - 1;
//    }
//}
