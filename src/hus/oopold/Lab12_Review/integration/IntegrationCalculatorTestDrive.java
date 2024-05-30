package hus.oopold.Lab12_Review.integration;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        // Create an ArrayPolynomial instance
        ArrayPolynomial poly = new ArrayPolynomial();

        // Test adding elements to the polynomial
        poly.append(2.0); // Adding a term with coefficient 2.0
        poly.append(3.5); // Adding a term with coefficient 3.5

        // Test updating a coefficient in the polynomial
        poly.set(4.0, 0); // Update the coefficient at index 0 to 4.0

        // Test adding two polynomials
        ArrayPolynomial poly2 = new ArrayPolynomial();
        poly2.append(1.0);
        poly.plus(poly2); // Add poly2 to poly

        // Test subtracting two polynomials
        ArrayPolynomial poly3 = new ArrayPolynomial();
        poly3.append(0.5);
        poly.minus(poly3); // Subtract poly3 from poly

        // Test multiplying two polynomials
        ArrayPolynomial poly4 = new ArrayPolynomial();
        poly4.append(2.0);
        poly.multiply(poly4); // Multiply poly by poly4

        // Test evaluating the polynomial at a specific value of x
        double result = poly.evaluate(2.0); // Evaluate the polynomial at x = 2.0
        System.out.println("Result of evaluating the polynomial: " + result);

    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        // Create a ListPolynomial instance
        ListPolynomial poly = new ListPolynomial();

        // Test adding elements to the polynomial
        poly.append(2.0); // Adding a term with coefficient 2.0
        poly.append(3.5); // Adding a term with coefficient 3.5

        // Test updating a coefficient in the polynomial
        poly.set(4.0, 0); // Update the coefficient at index 0 to 4.0

        // Test adding two polynomials
        ListPolynomial poly2 = new ListPolynomial();
        poly2.append(1.0);
        poly.plus(poly2); // Add poly2 to poly

        // Test subtracting two polynomials
        ListPolynomial poly3 = new ListPolynomial();
        poly3.append(0.5);
        poly.minus(poly3); // Subtract poly3 from poly

        // Test multiplying two polynomials
        ListPolynomial poly4 = new ListPolynomial();
        poly4.append(2.0);
        poly.multiply(poly4); // Multiply poly by poly4

        // Test evaluating the polynomial at a specific value of x
        double result = poly.evaluate(2.0); // Evaluate the polynomial at x = 2.0
        System.out.println("Result of evaluating the polynomial: " + result);

    }

    private static void writeResultsToFile(String fileName, String content) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            writer.println(content);
            writer.close();
            System.out.println("Results written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        // Create a polynomial
        ArrayPolynomial poly = new ArrayPolynomial();
        poly.append(1); // Coefficient for x^2
        poly.append(2); // Coefficient for x
        poly.append(3); // Coefficient for constant term

        // Create integration calculator with different integrators
        Integrator midpointRule = new MidpointRule(0.0001, 1000);
        Integrator trapezoidRule = new TrapezoidRule(0.0001, 1000);
        Integrator simpsonRule = new SimpsonRule(0.0001, 1000);

        IntegrationCalculator calculatorMidpoint = new IntegrationCalculator(midpointRule, poly);
        IntegrationCalculator calculatorTrapezoid = new IntegrationCalculator(trapezoidRule, poly);
        IntegrationCalculator calculatorSimpson = new IntegrationCalculator(simpsonRule, poly);

        // Compute definite integrals
        double integralMidpoint = calculatorMidpoint.integrate(0, 1);
        double integralTrapezoid = calculatorTrapezoid.integrate(0, 1);
        double integralSimpson = calculatorSimpson.integrate(0, 1);

        // Print results
        System.out.println("Using Midpoint Rule: Integral = " + integralMidpoint);
        System.out.println("Using Trapezoid Rule: Integral = " + integralTrapezoid);
        System.out.println("Using Simpson Rule: Integral = " + integralSimpson);

        // Write results to a text file
        writeResultsToFile("Integration_Result.txt", "Using Midpoint Rule: Integral = " + integralMidpoint + "\n" +
                "Using Trapezoid Rule: Integral = " + integralTrapezoid + "\n" +
                "Using Simpson Rule: Integral = " + integralSimpson);
    }
}
