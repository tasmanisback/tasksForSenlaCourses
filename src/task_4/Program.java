package task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Program {
    //not case sensitive
    static int getWordCount(String text, String word) {
        if (word.equals("") || text.equals("")) throw new IllegalArgumentException("Неверный ввод");

        text = text.toLowerCase();
        word = word.toLowerCase();

        int counter = 0;
        Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}