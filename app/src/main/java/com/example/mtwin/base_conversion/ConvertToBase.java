package com.example.mtwin.base_conversion;

import java.util.ArrayList;

public class ConvertToBase {
    private int input;
    private String output;
    private int base;
    private ArrayList chars;
    public void ConvertToBase(int input, int base){
        this.input = input;
        this.base = base;
    }

    public String outputNum(){

        return output;
    }
}
