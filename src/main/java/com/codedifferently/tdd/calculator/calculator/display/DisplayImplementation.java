package com.codedifferently.tdd.calculator.calculator.display;

import java.util.Arrays;

public class DisplayImplementation implements Display{
    public DisplayMode displayMode;

    public DisplayImplementation(){
        this.displayMode = DisplayMode.DECIMAL;

    }

    @Override
    public DisplayMode switchDisplayMode() {
        int newDisplayOrdinal;
        if (getCurrentDisplayMode().ordinal() == DisplayMode.values().length-1)
            { newDisplayOrdinal = 0;
            } else newDisplayOrdinal = getCurrentDisplayMode().ordinal()+1;

        String valueString = Arrays.toString(DisplayMode.values());
        String[] options = valueString.split(" ");
        String newMode  = options[newDisplayOrdinal].replaceAll("]", "").trim();
        return this.displayMode = DisplayMode.valueOf(newMode);
    }

    @Override
    public DisplayMode switchDisplayMode(String mode) {
        return this.displayMode = DisplayMode.valueOf(mode.toUpperCase());
    }

    @Override
    public DisplayMode getCurrentDisplayMode() {
        return this.displayMode;
    }
}




