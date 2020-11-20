package com.codedifferently.tdd.calculator.calculator.display;

public class DisplayImplementation implements Display{
    public DisplayMode displayMode;

    public DisplayImplementation(){
        this.displayMode = DisplayMode.DECIMAL;

    }

    @Override
    public void switchDisplayMode() {
        // use enum array to cycle through
        // display mode options in sequence
        // account for eol by resetting to first item
    }

    @Override
    public DisplayMode switchDisplayMode(String mode) {
        this.displayMode = DisplayMode.valueOf(mode);
        return this.displayMode;
        // take passed in string and check if it matches an item from the enum array.
        // set display mode to entered string using a switch case.
        // Factor for text casing by ignoring case
    }

    @Override
    public DisplayMode getCurrentDisplayMode() {
        return this.displayMode;
    }
}




