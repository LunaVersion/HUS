package hus.oop.lab4.themypolynomialclass;

public class TestMyPolynomial {
    public static void main(String[] args) {
        double[] coeffs = {1.2, 3.4, 5.6};
        MyPolynomial polynomial1 = new MyPolynomial(coeffs);
        MyPolynomial polynomial2 = new MyPolynomial(new double[] {1.1, 2.2, 3.3});
        MyPolynomial polynomial3 = polynomial1.add(polynomial2);
        System.out.println(polynomial3.toString());
        System.out.println("The degree of the polynomial: "+polynomial3.getDegree());

        System.out.println("The first polynomial: ");
        System.out.println("f(x) = " + polynomial1.toString());
        System.out.println("In x = 3: ");
        System.out.println("f(3) = " + polynomial1.evaluate(3));

        System.out.println();

        System.out.println("The second polynomial: ");
        System.out.println("f(x) = " + polynomial2.toString());
        System.out.println("In x = 4: ");
        System.out.println("f(4) = " + polynomial2.evaluate(4));
    }
}
