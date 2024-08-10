package com.designpatterns.creational.factory;

public class Triangle implements Shape{

    private double s1, s2, s3;

    Triangle(double s1, double s2, double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }

    private double semiperimeter(){
        return ((s1+s2+s3)/2);
    }

    @Override
    public double getArea() {
        double s = semiperimeter();
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
}
