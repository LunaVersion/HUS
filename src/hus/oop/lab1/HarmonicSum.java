package hus.oop.lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATION = 2;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for(int denominator = 1; denominator <= MAX_DENOMINATION; ++denominator) {
            sumL2R = sumL2R + 1 / (double) denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        for(int denominator = MAX_DENOMINATION; denominator >= 1; --denominator) {
            sumR2L = sumR2L + 1 / (double) denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumR2L);

        if (sumL2R > sumR2L){
            absDiff = sumL2R - sumR2L;
        }else{
            absDiff = sumR2L - sumL2R;
        }
        System.out.println(absDiff);
    }
}
