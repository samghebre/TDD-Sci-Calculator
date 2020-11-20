package com.codedifferently.tdd.calculator.calculator.display;

public interface Display {
    DisplayMode switchDisplayMode();
    DisplayMode switchDisplayMode(String mode);
    DisplayMode getCurrentDisplayMode();


}