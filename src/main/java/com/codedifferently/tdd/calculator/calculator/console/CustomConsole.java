package com.codedifferently.tdd.calculator.calculator.console;

import java.util.Scanner;

public class CustomConsole {
    private Scanner scanner;

    public CustomConsole() {
        scanner = new Scanner(System.in);
    }

    public void Print(String result, Object ... objects) {
        // ToDo
    }

    public void printLn(String result, Object ... objects) {
        // Todo
    }

    public String getStringInput(String prompt) {
        return null;
    }

    public Integer getIntegerInput(String prompt) {
        return null;
    }

    public Double getDoubleInput(String prompt) {
        return null;
    }
}
