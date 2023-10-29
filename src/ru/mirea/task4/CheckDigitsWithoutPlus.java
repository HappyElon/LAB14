package ru.mirea.task4;

import java.util.regex.*;

public class CheckDigitsWithoutPlus {
    public static void main(String[] args) {
        String text = "Текст с цифрами 123, 456 и 7, но +42 и +99 не подходят.";

        Pattern pattern = Pattern.compile("\\d(?![+])");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("В тексте есть цифры, за которыми не стоит знака \"+\".");
        } else {
            System.out.println("В тексте нет цифр без знака \"+\".");
        }
    }
}
