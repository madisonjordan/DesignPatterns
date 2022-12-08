package com.codewithmosh.OOP.ui;

public class Main {
    // Inheritance Example
    /*
    public static void main(String[] args) {
        // TextBox
        var textBox = new TextBox();
        textBox.enable();
        // Button
        // CheckBox

        // enable()
        // focus()
        // setPosition()


    }
    */

    // Polymorphism Example
    public static void main(String[] args) {
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}