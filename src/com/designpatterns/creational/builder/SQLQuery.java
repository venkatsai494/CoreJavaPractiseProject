package com.designpatterns.creational.builder;

public class SQLQuery {
    private String table;
    private String whereClause;
    private String orderByClause;
    private int limit;

    private SQLQuery(SQLQueryBuilder builder) {
        this.table = builder.table;
        this.whereClause = builder.whereClause;
        this.orderByClause = builder.orderByClause;
        this.limit = builder.limit;
    }

    public static class SQLQueryBuilder {
        private String table;
        private String whereClause;
        private String orderByClause;
        private int limit;

        public SQLQueryBuilder setTable(String table) {
            this.table = table;
            return this;
        }

        public SQLQueryBuilder setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }

        public SQLQueryBuilder setOrderByClause(String orderByClause) {
            this.orderByClause = orderByClause;
            return this;
        }

        public SQLQueryBuilder setLimit(int limit) {
            this.limit = limit;
            return this;
        }

        public SQLQuery build() {
            return new SQLQuery(this);
        }
    }
}
