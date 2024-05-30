package hus.oop.lab5.theballandplayerclasses;

public class Player {
    private float x;
    private float y;
    private float z = 0.0f;
    private int number;

    public Player(float x, float y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
    }

    public float getX() {
        return x;
    }

    public int getNumber() {
        return number;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void move(float xDisp, float yDisp) {
        // Di chuyển người chơi bằng cách tăng hoặc giảm tọa độ x và y
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        // Thực hiện nhảy bằng cách thay đổi tọa độ z
        this.y += zDisp;
    }

    public boolean near(Ball ball) {
        // Kiểm tra xem người chơi có gần quả bóng không dựa trên khoảng cách Euclid giữa họ
        double distance = Math.sqrt(Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2));
        return distance < 10; // Ví dụ: Nếu khoảng cách nhỏ hơn 10, coi là gần
    }

    public void kick(Ball ball) {

    }
}
