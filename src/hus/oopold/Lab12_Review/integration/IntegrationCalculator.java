package hus.oopold.Lab12_Review.integration;


public class IntegrationCalculator {
    private Integrator integrator;
    private Polynomial poly;


    /**
     * Hàm dựng, khởi tạo đa thức cần tính tích phân.
     * @param poly
     */
    public IntegrationCalculator(Polynomial poly) {
        /* TODO */
        this.poly=poly;
    }

    /**
     * Hàm dựng, khởi tạo phương pháp tính tích phân và đa thức cần tính tích phân.
     * @param integrator
     * @param poly
     */
    public IntegrationCalculator(Integrator integrator, Polynomial poly) {
        /* TODO */
        this.integrator = integrator;
        this.poly = poly;
    }

    public void setPoly(Polynomial poly) {
        /* TODO */
        this.poly=poly;
    }

    public void setIntegrator(Integrator integrator) {
        /* TODO */
        this.integrator=integrator;
    }

    public double integrate(double lower, double upper) {
        /* TODO */
        double integralValueAtUpper = 0.0;
        double integralValueAtLower = 0.0;

        for (int i = 0; i <= poly.degree(); i++) {
            double coeff = poly.coefficient(i);
            double integralCoeff = coeff / (i + 1);
            integralValueAtUpper += integralCoeff * Math.pow(upper, i + 1);
            integralValueAtLower += integralCoeff * Math.pow(lower, i + 1);
        }

        return integralValueAtUpper - integralValueAtLower;
    }
}
