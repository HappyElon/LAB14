package ru.mirea.task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String input = scanner.nextLine();

        String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|[1][0-2])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])$";

        Matcher matcher = Pattern.compile(regex).matcher(input);

        if (matcher.matches()) {
            System.out.println("Эта строка является строкой формата времени.");
        } else {
            System.out.println("Эта строка не является строкой формата времени.");
        }
    }
}
