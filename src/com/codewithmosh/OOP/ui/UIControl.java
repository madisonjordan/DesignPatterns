package com.codewithmosh.OOP.ui;

public abstract class UIControl {
    public void enable() {
        System.out.println("Enabled");
    }
    // polymorphism - abstract
    public abstract void draw();
}
