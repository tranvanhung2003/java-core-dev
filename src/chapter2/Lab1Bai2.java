package chapter2;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap hai canh cua hinh chu nhat.");
        System.out.println("Canh thu nhat:");
        float x = Float.parseFloat(scanner.nextLine());

        System.out.println("Canh thu hai:");
        float y = Float.parseFloat(scanner.nextLine());

        float chuVi = (x + y) * 2;
        float dienTich = x * y;
        float canhNhoNhat = Math.min(x, y);

        System.out
                .println("Chu vi: %.2f, dien tich: %.2f, canh nho nhat: %.2f".formatted(chuVi, dienTich, canhNhoNhat));

        scanner.close();
    }
}
