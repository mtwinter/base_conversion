package com.example.mtwin.base_conversion;

public class ConvertToDecimal {
    private String input;
    private int output;
    private int base;

    public void ConvertToDecimal(String input, int base){
        this.input = input;
        this.base = base;
    }

    public int outputDecimal(){
        char[] chars;
        chars = new char[input.length()];
        chars = input.toCharArray();
        for(int i = 0; i < input.length(); i++){
            if(chars[i] == 1 || chars[i] == 2 || chars[i] == 3 || chars[i] == 4 || chars[i] == 5 || chars[i] == 6 || chars[i] == 7 || chars[i] == 8 || chars[i] == 9 || chars[i] == 0){
                output += chars[i] * Math.pow(base, i);
            }
        }
        return output;
    }
}
