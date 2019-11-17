package task_3;

import common.ConsoleReader;

import java.util.InputMismatchException;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Введите предложение: ");

        try {
            String sentence = ConsoleReader.readSentence();

            List<String> words = Program.getWords(sentence);
            System.out.println("Количество слов: " + words.size());
            Program.sort(words);

            System.out.println(words);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
