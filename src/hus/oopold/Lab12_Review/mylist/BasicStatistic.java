package hus.oopold.Lab12_Review.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        double max = (double) data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if(max <= (double) data.get(i)){
                max = (double) data.get(i);
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        double min = (double) data.get(0);
        for (int i = 1; i < data.size(); i++) {
            if((double) data.get(i) <= min){
                min = (double) data.get(i);
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (double) data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        // Step 1: Calculate the mean
        double sum = 0.0;
        for (int i = 0; i < data.size(); i++) {
            sum += ((Number) data.get(i)).doubleValue();
        }
        double mean = sum / data.size();

        // Step 2: Calculate the squared differences
        double squaredDifferenceSum = 0.0;
        for (int i = 0; i < data.size(); i++) {
            double value = ((Number) data.get(i)).doubleValue();
            squaredDifferenceSum += Math.pow(value - mean, 2);
        }

        // Step 3: Calculate the variance
        return squaredDifferenceSum / data.size();
    }
}
