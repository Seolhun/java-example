package com.algorithm.bj.done.a0000;

enum Order {
    ASC("ASC"),
    DESC("DESC"),
    NOTSORTED("NOTSORTED");

    private String order;

    Order(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }
}
