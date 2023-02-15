package util;

import java.util.Scanner;

public class InputUtil {
    public static byte byteInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        byte number = scanner.nextByte();

        return number;
    }
    public static String stringInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        String number = scanner.nextLine();
        return number;
    }
    public static int intInput(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        int number = scanner.nextInt();
        return number;
    }

}
