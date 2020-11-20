package com.codedifferently.tdd.calculator.calculator.display;

public interface Display {
    void switchDisplayMode();
    DisplayMode switchDisplayMode(String mode);
    DisplayMode getCurrentDisplayMode();


}