package com.algorithm.bj.done.a0000;

class NumberType {
    private String order;
    private int[] numbers;
    private int length;

    NumberType(int[] numbers) {
        this.numbers = numbers;
        this.length = numbers.length;
        this.order = "";
    }

    int[] getNumbers() {
        return numbers;
    }

    int getLength() {
        return length;
    }

    String getOrder() {
        return order;
    }

    void getOrderFromData(int index) {
        if(this.length == index+1) {
            return;
        }

        if(!this.order.equals("")) {
            if(this.numbers[index] > this.numbers[index+1]) {
                if(this.order.equals(Order.DESC.name())) {
                } else {
                    this.order = Order.NOTSORTED.name();
                    return;
                }
            } else if(this.numbers[index] < this.numbers[index+1]) {
                if (this.order.equals(Order.ASC.name())) {
                } else {
                    this.order = Order.NOTSORTED.name();
                    return;
                }
            }
        }

        if(this.numbers[index] > this.numbers[index+1]) {
            this.order = Order.DESC.name();
        } else if(this.numbers[index] < this.numbers[index+1]) {
            this.order = Order.ASC.name();
        } else if(this.numbers[index] == this.numbers[index+1]) {
            getOrderFromData(index+1);
        } else {
            this.order = Order.NOTSORTED.name();
        }

        if(this.length <= 2) {
            return;
        }
        getOrderFromData(index+1);
    }

    void printResult(int index) {
        System.out.println("Case" + index);
        System.out.println(this.order);
    }
}