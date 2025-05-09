package service;

import java.util.Scanner;

public class InputHelper {
    private final Scanner scanner = new Scanner(System.in);

    public int scanInt(Object object) {
        System.out.println(object);
        return scanner.nextInt();
    }

    public double scanDouble(Object object) {
        System.out.print(object);
        return scanner.nextDouble();
    }

    public float scanFloat(Object object) {
        System.out.print(object);
        return scanner.nextFloat();
    }

    public String scanString(Object object) {
        System.out.print(object);
        scanner.nextLine();
        return scanner.nextLine();
    }
}
