package com.algorithm.testdome.java.done;

public class UserInput {
    /*
    * Implement the class TextInput that contains:
    - Public method void add(char c) - adds the given character to the current value
    - Public method String getValue() - returns the current value

    Implement the class NumericInput that:
    - Inherits from TextInput
    - Overrides the add method so that each non-numeric character is ignored
    * */
    public static class TextInput {
        public String currentValue = "";

        public void add(char c) {
            this.currentValue += c;
        }

        public String getValue() {
            return String.valueOf(this.currentValue);
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            if(Character.isDigit(c)){
                System.out.println(c);
                this.currentValue += c;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}