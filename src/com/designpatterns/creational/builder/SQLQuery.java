package com.designpatterns.creational.builder;

public class SQLQuery {
    private String select;
    private String table;
    private String whereClause;
    private String orderByClause;
    private int limit;

    private SQLQuery(SQLQueryBuilder builder) {
        this.select = builder.select;
        this.table = builder.table;
        this.whereClause = builder.whereClause;
        this.orderByClause = builder.orderByClause;
        this.limit = builder.limit;
    }

    @Override
    public String toString(){
        StringBuilder query = new StringBuilder();
        if(select!=null)
            query.append("SELECT ").append(select).append(" ");
        if(table!=null)
            query.append("FROM ").append(table).append(" ");
        if(whereClause!=null)
            query.append("WHERE ").append(table).append(" ");
        return query.toString().trim();
    }

    public static class SQLQueryBuilder {
        private String select;
        private String table;
        private String whereClause;
        private String orderByClause;
        private int limit;

        public SQLQueryBuilder setSelect(String select) {
            this.select = select;
            return this;
        }
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
