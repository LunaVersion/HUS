package thietkevadanhgiathuattoan.Hw4_21000684_LeThiHuong;

import java.util.ArrayList;

public class ActivitySelection {
    static class Interval {
        int start;
        int end;

        // Constructor
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private int[] s = new int[]{1, 2, 4, 1, 5, 8, 9, 11, 13};
    private int[] f = new int[]{3, 5, 7, 8, 9, 10, 11, 14, 16};
    private ArrayList<Interval> A;

    public ArrayList<Interval> activitySelection() {
        ArrayList<Interval> S = new ArrayList<Interval>();
        A = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            A.add(new Interval(s[i], f[i]));
        }
        int j = 1;
        for (int i = 2; i < A.size(); i++) {
            if (s[i] > f[j]) {
                S.add(A.get(i));
                j = i;
            }
        }
        return S;
    }

    public static void main(String[] args) {
        ActivitySelection activity = new ActivitySelection();
        ArrayList<Interval> result = activity.activitySelection();
        for (Interval interval : result) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
