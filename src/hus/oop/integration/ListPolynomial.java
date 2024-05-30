//package hus.oop.integration;
//
//import java.util.List;
//
//public class ListPolynomial extends AbstractPolynomial {
//    private List<Double> coefficients;
//
//    public ListPolynomial(List<Double> coefficients) {
//        this.coefficients = coefficients;
//    }
//
//    /**
//     * Khởi tạo dữ liệu mặc định.
//     */
//    public ListPolynomial() {
//        /* TODO */
//    }
//
//    /**
//     * Lấy hệ số của đa thức tại vị trí index.
//     * @return
//     */
//    @Override
//    public double coefficient(int index) {
//        /* TODO */
//        return coefficients.get(index);
//    }
//
//    /**
//     * Lấy các hệ số của đa thức.
//     * @return
//     */
//    @Override
//    public double[] coefficients() {
//        /* TODO */
//        double[] target = new double[coefficients.size()];
//        for (int i = 0; i < target.length; i++) {
//            target[i] = coefficients.get(i);
//        }
//        return target;
//    }
//
//    /**
//     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
//     * @param coefficient
//     * @return đa thức hiện tại.
//     */
//    public ListPolynomial append(double coefficient) {
//        /* TODO */
//        coefficients.add(coefficients.size(), coefficient);
//        return coefficients(coefficients.size() + 1);
//    }
//
//    /**
//     * Thêm phần tử có hệ số coefficient vào vị trí index.
//     * @param coefficient
//     * @param index
//     * @return đa thức hiện tại.
//     */
//    public ListPolynomial insert(double coefficient, int index) {
//        /* TODO */
//    }
//
//    /**
//     * Sửa hệ số của phần tử index là coefficient.
//     * @param coefficient
//     * @param index
//     * @return đa thức hiện tại.
//     */
//    public ListPolynomial set(double coefficient, int index) {
//        /* TODO */
//
//    }
//
//    /**
//     * Lấy ra bậc của đa thức.
//     * @return
//     */
//    @Override
//    public int degree() {
//        /* TODO */
//        return coefficients.size() - 1;
//    }
//
//    /**
//     * Tính giá trị của đa thức khi biết giá trị của x.
//     * @return
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
//     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
//     */
//    @Override
//    public Polynomial derivative() {
//        /* TODO */
//        return new ListPolynomial(this.derive()) {
//        };
//    }
//
//    /**
//     * Cộng đa thức hiện tại với đa thức khác.
//     * @param another
//     * @return đa thức hiện tại.
//     */
//    public ListPolynomial plus(ListPolynomial another) {
//        /* TODO */
//        ListPolynomial plusList = this;
//        for (int i = 0; i < plusList.coefficients.size(); i++) {
//            plusList.coefficients.set(i, plusList.coefficient(i) - another.coefficient(i));
//        }
//        return plusList;
//    }
//
//    /**
//     * Trừ đa thức hiện tại với đa thức khác.
//     * @param another
//     * @return đa thức hiện tại.
//     */
//    public ListPolynomial minus(ListPolynomial another) {
//        /* TODO */
//        ListPolynomial minusList = this;
//        for (int i = 0; i < minusList.coefficients.size(); i++) {
//            minusList.coefficients.set(i, minusList.coefficient(i) - another.coefficient(i));
//        }
//        return minusList;
//    }
//
//    /**
//     * Nhân đa thức hiện tại với đa thức khác.
//     * @param another
//     * @return đa thức hiện tại.
//     */
//    public ListPolynomial multiply(ListPolynomial another) {
//        /* TODO */
//
//        return another;
//    }
//}
