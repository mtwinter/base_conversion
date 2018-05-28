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
        chars = input.toCharArray();
        for(int i = 0; i < input.length(); i++) {
            if (chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9' || chars[i] == '0') {
                output += (chars[i] - '0') * Math.pow(base, input.length()-i-1);
            } else if (chars[i] == 'a') {
                output += 10 * Math.pow(base, input.length()-i-1);
            } else if (chars[i] == 'b') {
                output += 11 * Math.pow(base, input.length()-i-1);
            } else if (chars[i] == 'c') {
                output += 12 * Math.pow(base, input.length()-i-1);
            } else if (chars[i] == 'd') {
                output += 13 * Math.pow(base, input.length()-i-1);
            } else if (chars[i] == 'e') {
                output += 14 * Math.pow(base, input.length()-i-1);
            } else if (chars[i] == 'f') {
                output += 15 * Math.pow(base, input.length()-i-1);
            }
        }
        return output;
    }
}
