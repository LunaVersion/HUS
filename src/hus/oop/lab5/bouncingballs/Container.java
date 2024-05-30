package hus.oop.lab5.bouncingballs;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width; // Điểm phải của container (x2) là x1 + width (không trừ đi 1)
        this.y2 = y + height; // Điểm dưới của container (y2) là y1 + height (không trừ đi 1)
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1; // Trả về chiều rộng của container, được tính bằng sự chênh lệch giữa x2 và x1
    }

    public int getHeight() {
        return y2 - y1; // Trả về chiều cao của container, được tính bằng sự chênh lệch giữa y2 và y1
    }
    public boolean collideWith(Ball ball) {
        if ((ball.getX() - ball.getRadius() <= this.x1) || (ball.getX() + ball.getRadius() >= this.x2)) {
            ball.reflectHorizontal();
            return true;
        }
        // Các xử lý khác nếu cần
        return false; // Trả về false nếu không có va chạm
    }

}
