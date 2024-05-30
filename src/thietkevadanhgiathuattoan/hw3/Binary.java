package thietkevadanhgiathuattoan.hw3;

public class Binary {
    public static void generateBinarySequences(int n) {
        generateBinarySequencesHelper(n, "");
    }

    private static void generateBinarySequencesHelper(int n, String sequence) {
        if (sequence.length() == n) {
            System.out.println(sequence);
            return;
        }

        // Liệt kê các dãy nhị phân có độ dài n bằng cách thêm ký tự '0' hoặc '1' vào cuối dãy hiện tại
        generateBinarySequencesHelper(n, sequence + '0');
        generateBinarySequencesHelper(n, sequence + '1');
    }

    public static void main(String[] args) {
        int n = 2;
        generateBinarySequences(n);
    }
}
