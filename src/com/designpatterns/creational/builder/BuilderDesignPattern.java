package com.designpatterns.creational.builder;

public class BuilderDesignPattern {

    public static void main(String[] args) {
        House h1 = new House.HouseBuilder()
                        .buildFoundation("Laying foundation")
                        .buildWalls("Buliding walls")
                        .buildRoof("Buliding roof by laying slab")
                        .build();

    }

    SQLQuery sql = new SQLQuery.SQLQueryBuilder()
            .setSelect("EMP_ID")
            .setTable("EMPLOYEE")
            .setWhereClause()
}