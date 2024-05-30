package hus.oop.homework2.decisionandloop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DecisionAndLoopsHomework implements WordGuess, NumberGuess {
    @Override
    public void guessNumber() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numberRandom = random.nextInt(0, 99);
        guessNumber(numberRandom, sc);
    }

    @Override
    public void guessNumber(int number, Scanner in) {
        System.out.println("Key in your guess:");
        int yourGuessNumber = in.nextInt();
        int count = 0;
        while(yourGuessNumber != number) {
            if (yourGuessNumber < number) {
                System.out.println("Try higher: ");
                yourGuessNumber = in.nextInt();
                count++;
            } else if (yourGuessNumber > number) {
                System.out.println("Try lower: ");
                yourGuessNumber = in.nextInt();
                count++;
            }
        }
        in.close();
        System.out.println("You got it in " + count + " trial!");
    }

    @Override
    public void guessWord() {
        Scanner sc = new Scanner(System.in);
        String filePath = "D:\\Java_Project\\src\\hus\\oop\\homework2\\decisionandloop\\word.txt";
        ArrayList<String> words = new ArrayList<>(); // danh sach luu tru cac tu
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        // Chọn một từ ngẫu nhiên từ danh sách
        String randomWord = getRandomWord(words);

        guessWord(randomWord, sc);
    }

    @Override
    public void guessWord(String guessedString, Scanner in) {
        System.out.println("Key in one character or your guess word:");
        String yourGuessWord = in.nextLine();
        char[] charGuessedString = guessedString.toCharArray();
        int count = 0;
        int length = guessedString.length();
        boolean[] arr = new boolean[length];

        String[] output = new String[length];
        for (int i = 0; i < length; i++) {
            output[i]  = "_";
        }

        while(yourGuessWord.length() == 1) {
            char[] charYourGuessWord = yourGuessWord.toCharArray();
            for (int i = 0; i < length; i++) {
                    if (charYourGuessWord[0] == charGuessedString[i]) {
                        arr[i] = true;
                    }
                }
                count++;
            for (int i = 0; i < length; i++) {
                if(arr[i] == true) {
                    output[i] = yourGuessWord;
                    arr[i] = false;
                }
            }

            System.out.print("Trial " + count + ": ");

            for (int i = 0; i < length; i++) {
                System.out.print(output[i]);
            }
            System.out.print("\nKey in one character or your guess word:");
            yourGuessWord = in.nextLine();

        }
        if(yourGuessWord.equals(guessedString)) {
            System.out.println("Congratulations!");
        }
    }

    // chọn từ ngẫu nhiên từ danh sách
    private static String getRandomWord(ArrayList<String> words) {
        Random random = new Random();
        int index = random.nextInt(words.size());
        while(words.get(index).length() == 1) {
            index = random.nextInt(words.size());
        }
        return words.get(index);
    }
}
