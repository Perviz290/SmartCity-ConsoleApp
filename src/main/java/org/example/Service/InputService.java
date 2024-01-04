package org.example.Service;

import org.example.Service.Interface.InputInterface;

import java.util.Scanner;

public class InputService implements InputInterface {
    @Override
    public String getInputString(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text + ":");
        String result = scan.nextLine();
        return result;
    }

    @Override
    public int getInputInteger(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text + ":");
        int result = scan.nextInt();
        return result;

    }
}
