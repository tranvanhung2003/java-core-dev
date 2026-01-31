package chapter2;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap canh cua khoi lap phuong:");
        float edgeLength = Float.parseFloat(scanner.nextLine());

        double volume = Math.pow(edgeLength, 3);

        System.out.println("The tich khoi lap phuong: %.2f".formatted(volume));

        scanner.close();
    }
}
