package com.codedifferently.tdd.calculator.calculator.display;

public class DisplayImplementation implements Display{
    public DisplayMode displayMode;

    public DisplayImplementation(){
        this.displayMode = DisplayMode.DECIMAL;

    }

    @Override
    public void switchDisplayMode() {

    }

    @Override
    public void switchDisplayMode(String mode) {

    }

    @Override
    public DisplayMode getCurrentDisplayMode() {
        return this.displayMode;
    }
}




