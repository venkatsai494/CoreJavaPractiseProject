package com.designpatterns.creational.builder;



public class BuilderDesignPattern {

    public static void main(String[] args) throws IllegalArgumentException {
        House h1 = new House.HouseBuilder()
                        .buildFoundation("Laying foundation")
                        .buildWalls("Buliding walls")
                        .buildRoof("Buliding roof by laying slab")
                        .build();
        System.out.println(h1.toString());

        SQLQuery sql = new SQLQuery.SQLQueryBuilder()
                .setSelect("EMP_ID, EMP_SALARY")
                .setFromClause("EMPLOYEE")
                .setWhereClause("SALARY>175000")
                .setSelect("EMPI_ID")
                .setOrderByClause("EMP_ID")
                .setLimit(20)
                .build();

        System.out.println(sql.toString());

    }
}