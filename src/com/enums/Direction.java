package com.enums;

public enum Direction {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    private final int degrees;

    Direction(int degrees) {
        this.degrees = degrees;
    }

    public int getDegrees() {
        return degrees;
    }

    // Additional methods can be added here

    // Example usage:
    // Direction direction = Direction.NORTH;
    // int degrees = direction.getDegrees();


}


class Demo1{

    public static void main(String[] args) {
        Direction direction = Direction.SOUTH;//point to be noted here is that when you call enumclassname.fieldname the output would be of type enum, i.e. Direction in this case
        int degrees = direction.getDegrees();
        System.out.println(degrees);
    }

}