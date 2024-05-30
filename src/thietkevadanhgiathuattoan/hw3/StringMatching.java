package thietkevadanhgiathuattoan.hw3;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StringMatching {
    public static List<Integer> findOccurrences(String text, String line) {
        List<Integer> occurrences = new ArrayList<>();
        int index = 0;
        while ((index = line.indexOf(text, index)) != -1) {
            occurrences.add(index);
            index += text.length();
        }
        return occurrences;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Java\\Luna\\src\\thietkevadanhgiathuattoan\\hw3\\example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                List<Integer> op = findOccurrences(text, line);
                if (op.isEmpty()) {
                    System.out.println("Not found.");
                } else {
                    System.out.println(op);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
