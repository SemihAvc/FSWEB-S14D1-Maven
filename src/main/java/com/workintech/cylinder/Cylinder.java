package com.workintech.cylinder;

public class Cylinder extends  Circle{
    private  double heigth;

    public Cylinder(double radius, double heigth) {
        super(radius);
        if (heigth<0)
        this.heigth = 0;
    }

    public double getHeigth() {
        return heigth;
    }
    public double getVolume(){
        return super.getArea()*this.heigth;

    }

    public double  getHeight() {
return super.getArea()*this.heigth;
    }
}
