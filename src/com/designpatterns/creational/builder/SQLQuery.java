package com.designpatterns.creational.builder;

public class SQLQuery {
    private String selectClause;
    private String fromClause;
    private String whereClause;
    private String orderByClause;
    private int limit;

    private SQLQuery(SQLQueryBuilder builder) throws IllegalArgumentException {
        this.selectClause = builder.selectClause;
        this.fromClause = builder.fromClause;
        this.whereClause = builder.whereClause;
        this.orderByClause = builder.orderByClause;
        this.limit = builder.limit;
        if(selectClause == null || selectClause.isEmpty())
            throw new IllegalArgumentException("SELECT clause cannot be null or empty");
        if(fromClause == null || fromClause.isEmpty())
            throw new IllegalArgumentException("FROM clause cannot be null or empty");
    }
    @Override
    public String toString(){
        StringBuilder query = new StringBuilder();
        if(selectClause !=null)
            query.append("SELECT ").append(selectClause).append(" ");
        if(fromClause !=null)
            query.append("FROM ").append(fromClause).append(" ");
        if(whereClause!=null)
            query.append("WHERE ").append(whereClause).append(" ");
        if(orderByClause!=null)
            query.append("ORDER BY ").append(orderByClause).append(" ");
        if(limit!=0)
            query.append("LIMIT ").append(limit);
        return query.toString().trim();
    }


    public static class SQLQueryBuilder {
        private String selectClause;
        private String fromClause;
        private String whereClause;
        private String orderByClause;
        private int limit;

        public SQLQueryBuilder setSelect(String select) {
            this.selectClause = select;
            return this;
        }
        public SQLQueryBuilder setFromClause(String fromClause) {
            this.fromClause = fromClause;
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

        public SQLQuery build() throws IllegalArgumentException {
            return new SQLQuery(this);
        }


    }
}
