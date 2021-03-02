package task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Обучение\\ДЗ\\For task 9.3.txt");

        for (Map.Entry<Integer, String> entry : readFileToMap(file).entrySet()) {
            System.out.println("Place: " + entry.getKey() + " participant: " + entry.getValue());
        }
    }

    private static Map<Integer, String> readFileToMap(File file) {
        Map<Integer, String> participants = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.split(" ");

                participants.put(Integer.parseInt(splitLine[0]), splitLine[1]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return participants;
    }
}
