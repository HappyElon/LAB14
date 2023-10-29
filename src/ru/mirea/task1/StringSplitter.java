package ru.mirea.task1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.print("Введите регулярное выражение: ");
        String regex = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int matchCount = 0;
        while (matcher.find()) {
            matchCount++;
            System.out.println("Соответствие " + matchCount + ": " + matcher.group());
        }

        if (matchCount == 0) {
            System.out.println("Соответствий не найдено.");
        }

        scanner.close();
    }
}

