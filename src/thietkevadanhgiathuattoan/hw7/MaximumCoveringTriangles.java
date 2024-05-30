package thietkevadanhgiathuattoan.hw7;

import java.util.Arrays;

class Triangle {
    int x, y, height;

    Triangle(int x, int y, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }

    boolean canCover(Triangle other) {
        return x <= other.x && y <= other.y && x + height >= other.x + other.height && y + height >= other.y + other.height;
    }
}

public class MaximumCoveringTriangles {
    public static int maxCoveringTriangles(Triangle[] triangles) {
        Arrays.sort(triangles, (a, b) -> Integer.compare(b.height, a.height));
        int[] dp = new int[triangles.length];
        Arrays.fill(dp, 1);

        int maxTriangles = 1;
        for (int i = 1; i < triangles.length; i++) {
            for (int j = 0; j < i; j++) {
                if (triangles[i].canCover(triangles[j])) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxTriangles = Math.max(maxTriangles, dp[i]);
                }
            }
        }

        return maxTriangles;
    }

    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(1, 1, 5),
                new Triangle(2, 2, 3),
                new Triangle(3, 3, 2),
                new Triangle(4, 4, 1)
        };

        System.out.println("Maximum covering triangles: " + maxCoveringTriangles(triangles)); // Output: 3
    }
}

