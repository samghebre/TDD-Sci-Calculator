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
        this.displayMode = DisplayMode.valueOf(mode.toUpperCase());
        return this.displayMode;
        //todo input validation restraining to valid options
    }

    @Override
    public DisplayMode getCurrentDisplayMode() {
        return this.displayMode;
    }
}




