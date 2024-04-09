import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> linesList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\udav4\\IdeaProjects\\untitled25\\src\\javafile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        Collections.sort(linesList);

        System.out.println("Отсортированные строки:");
        for (String line : linesList) {
            System.out.println(line);
        }
    }
}
