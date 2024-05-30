package hus.oop.homework2.decisionandloop;

import java.util.Scanner;

public class Test extends DecisionAndLoopsHomework{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the method: \n1. Number Guess. \n2. Word Guess");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                DecisionAndLoopsHomework decisionAndLoopsHomeworkNumber = new DecisionAndLoopsHomework();
                decisionAndLoopsHomeworkNumber.guessNumber();
            case 2:
                DecisionAndLoopsHomework decisionAndLoopsHomeworkWord = new DecisionAndLoopsHomework();
                decisionAndLoopsHomeworkWord.guessWord();
        }
    }
}
