package com.workintech.pool;

public class Rectangle {
    private int length;
    private  int width;

    public Rectangle(int length, int width) {
        this.length = Math.max(length,0);
        this.width = Math.max(width,0);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public int getArea() {
        return this.width*this.length;
    }
}
