package Practice_5.Problem_2;

import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("D:\\OOP\\Practice_5\\Problem_2\\input.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue;
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        try (PrintWriter pw = new PrintWriter(
        "D:\\OOP\\Practice_5\\Problem_2\\report.txt")) {

            for (Map.Entry<String, Integer> entry : list) {
                pw.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("Report created!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}