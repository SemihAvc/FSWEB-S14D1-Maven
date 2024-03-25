package com.workintech.pool;

public class Cuboid extends  Rectangle{
    private int height;

    public Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = Math.max(height,0);
    }

    public int getHeight() {
        return height;
    }
    public  int getVolume(){
        return getArea()*height;
    }
}
