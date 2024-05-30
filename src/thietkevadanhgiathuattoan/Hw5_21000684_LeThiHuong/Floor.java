package thietkevadanhgiathuattoan.Hw5_21000684_LeThiHuong;

public class Floor {
    static int n; // Kích thước à
    static boolean[][] visited;
    static int[][] house;

    static boolean canPlaceL(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && !visited[x][y] && house[x][y] == 0;
    }

    static void placeL(int x, int y) {
        visited[x][y] = true;
        house[x][y] = 1;
        house[x][y + 1] = 1;
        house[x + 1][y] = 1;
    }

    static void removeL(int x, int y) {
        visited[x][y] = false;
        house[x][y] = 0;
        house[x][y + 1] = 0;
        house[x + 1][y] = 0;
    }

    static boolean floor(int x, int y, int count) {
        if (count == n * n - 1) { // nếu đã lát kín
            return true;
        }

        for (int i = x; i < n; i++) {
            for (int j = (i == x ? y : 0); j < n; j++) {
                if (canPlaceL(i, j)) {
                    placeL(i, j);
                    count++;

                    if (floor(i, j + 1, count)) {
                        return true;
                    }

                    removeL(i, j);
                    count--;
                }
            }
        }

        return false;
    }

    // Hàm để in ra trạng thái của nền nhà sau khi lát gạch
    static void printHouse() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(house[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        n = 4;
        visited = new boolean[n][n];
        house = new int[n][n];

        // Bắt đầu từ ô trên cùng bên trái của nền nhà
        floor(0, 0, 0);

        printHouse();
    }
}

