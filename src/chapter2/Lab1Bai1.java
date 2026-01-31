package chapter2;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten sinh vien:");
        String name = scanner.nextLine();

        System.out.println("Nhap diem:");
        float score = Float.parseFloat(scanner.nextLine());

        System.out.println("%s co diem la: %.2f".formatted(name, score));

        scanner.close();
    }
}
