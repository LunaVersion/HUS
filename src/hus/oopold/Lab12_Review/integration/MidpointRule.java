package hus.oopold.Lab12_Review.integration;

public class MidpointRule implements Integrator {
    private double precision;
    private int maxIterations;

    public MidpointRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int n = 1;
        double I_n = integrate(poly, lower, upper, n);
        double I_2n = integrate(poly, lower, upper, 2 * n);
        int iterations = 0;
        while (Math.abs(I_2n - I_n) / 3 >= precision && iterations < maxIterations) {
            n *= 2;
            I_n = integrate(poly, lower, upper, n);
            I_2n = integrate(poly, lower, upper, 2 * n);
            iterations++;
        }
        return I_2n;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double sum = 0;
        double step = (upper - lower) / numOfSubIntervals;
        for (int i = 0; i < numOfSubIntervals; i++) {
            double midpoint = lower + (i + 0.5) * step;
            sum += poly.evaluate(midpoint) * step;
        }
        return sum;
    }
}
