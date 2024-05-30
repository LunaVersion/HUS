package hus.oop.lab4.themypolynomialclass;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return this.coeffs.length;
    }

    public double evaluate(double x){
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right){
        int newDegree = Math.max(this.getDegree(), right.getDegree());
        double[] resultCoeffs = new double[newDegree];
        for (int i = 0; i < newDegree; i++) {
            double thisCoeff = (i < this.coeffs.length) ? this.coeffs[i] : 0;
            double rightCoeff = (i < right.coeffs.length) ? right.coeffs[i] : 0;
            resultCoeffs[i] = thisCoeff + rightCoeff;
        }
        return new MyPolynomial(resultCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right){
        int newDegree = this.getDegree() + right.getDegree() - 1;
        double[] resultCoeffs = new double[newDegree];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(resultCoeffs);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (i < coeffs.length - 1) {
                    sb.append(" + ");
                }
                sb.append(coeffs[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                }
            }
        }
        return sb.toString();
    }
}
