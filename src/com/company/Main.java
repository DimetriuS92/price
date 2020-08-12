package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену: ");
        int price = scanner.nextInt();

        if (price < 1000) {
            System.out.println("цена нормальная");
        } else if (price >= 1000) {
            System.out.println("цена завышена");
        } else {
            System.out.println("Введите число");
        }

    }
}
