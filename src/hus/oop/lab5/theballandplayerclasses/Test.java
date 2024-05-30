package hus.oop.lab5.theballandplayerclasses;

public class Test {
    public static void main(String[] args) {
        // Test Ball
        System.out.println("Testing Ball:");
        testBall();

        // Test Player
        System.out.println("\nTesting Player:");
        testPlayer();
    }

    public static void testBall() {
        Ball ball = new Ball(50, 50, 5);
        System.out.println(ball);
    }

    public static void testPlayer() {
        Player player = new Player(100, 100, 10);

        System.out.println("X coordinate: " + player.getX());
        System.out.println("Y coordinate: " + player.getY());
        System.out.println("Player number: " + player.getNumber());

        // Move player
        player.move(10, 20);
        System.out.println("After movement - X coordinate: " + player.getX());
        System.out.println("After movement - Y coordinate: " + player.getY());

        // Jump player
        player.jump(30);
        System.out.println("After jump - Y coordinate: " + player.getY());
    }
}
