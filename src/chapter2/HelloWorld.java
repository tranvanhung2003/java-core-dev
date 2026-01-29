package chapter2;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Tran Van Hung";

        System.out.println("Nhap tuoi cua ban:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Ten cua ban la: %s, tuoi cua ban la: %d".formatted(name, age));

        float pi = 3.1415164755f;
        System.out.println("Gia tri cua pi la: %.2f".formatted(pi));

        scanner.close();
    }
}
