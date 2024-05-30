package thietkevadanhgiathuattoan.hw7;

public class Market {
    public static int countValidChoices(int[] fishes, int amount) {
        return countValidChoicesRecursive(fishes, amount, 0);
    }

    public static int countValidChoicesRecursive(int[] fishes, int amount, int currentIndex) {
        if (amount == 0) {
            return 1; //ok
        }

        if (amount < 0 || currentIndex >= fishes.length) {
            return 0; // không ok
        }

        int includeCurrentFish = countValidChoicesRecursive(fishes, amount - fishes[currentIndex], currentIndex + 1);
        int excludeCurrentFish = countValidChoicesRecursive(fishes, amount, currentIndex + 1);

        return includeCurrentFish + excludeCurrentFish;
    }

    public static void main(String[] args) {
        int[] fishes = {3, 2, 4};
        int amount = 6;

        int validChoices = countValidChoices(fishes, amount);
        System.out.println("Number of valid choices: " + validChoices);
    }
}
